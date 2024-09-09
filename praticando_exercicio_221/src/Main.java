import entities.Produto;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Produto> list = new ArrayList<>();

        System.out.print("Caminho do Arquivo: ");
        String caminhoArquivo = sc.nextLine();

        File arquivo = new File(caminhoArquivo);
        String caminhoFonte = arquivo.getParent();

        boolean sucesso = new File(caminhoFonte + "\\eu").mkdir();
        System.out.println("Pasta criada: " + sucesso);


        String arquivoDestino = caminhoFonte + "\\eu\\exTeste.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {

            String itemCaminho = br.readLine();
            while (itemCaminho != null) {
                String[] campos = itemCaminho.split(",");
                if (campos.length < 3){
                    System.out.println("Linha ignorada devido à formatação incorreta: " + itemCaminho);
                }
                else {
                    String nome = campos[0];
                    double preco = Double.parseDouble(campos[1]);
                    Integer quantidade = Integer.parseInt(campos[2].trim());
                    list.add(new Produto(nome, preco, quantidade));
                }

                itemCaminho = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))){

                for (Produto item : list){
                    bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(arquivoDestino + "CRIADO");
            } catch (IOException e){
                System.out.println("Error ao escrever arquivo" + e.getMessage());
            }


        } catch (IOException e) {
            System.out.println("Error ao escrever o arquivo: " + e.getMessage());
        }


        sc.close();
    }
}
