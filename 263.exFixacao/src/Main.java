import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        System.out.print("Caminho do arquivo: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Funcionario> list = new ArrayList<>();

            String line = br.readLine();
            while(line!=null){
                String[] espacoBranco = line.split(", ");
                list.add(new Funcionario(espacoBranco[0], espacoBranco[1], Double.parseDouble(espacoBranco[2])));
                line = br.readLine();
            }

            System.out.print("Sugira um valor para ser o teto do salário: ");
            double teto = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter(f -> f.getSalario() > teto)
                    .map(f -> f.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Emails de pessoas cujo o salário é maior que o teto definido R$" + String.format("%.2f", teto) + ": ");
            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(p -> p.getNome().charAt(0) == 'M')
                    .map(p -> p.getSalario())
                    .reduce(0.0, (x,y) -> x+y);

            System.out.println("Soma dos salários das pessoas que tem o nome começado com 'M': " + String.format("%.2f", sum));

        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }

        sc.close();

    }
}