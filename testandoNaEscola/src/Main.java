import java.io.*;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho da Pasta: ");
        String caminhoTxt = "C:\\Ayslan\\testeLerArquivo\\in.txt";

        File arquivoTxt = new File(caminhoTxt);

        try(BufferedReader br = new BufferedReader(new FileReader(caminhoTxt))) {

            String linha = br.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }
        }catch (IOException e ){
            System.out.println("Error " + e.getMessage());
        }
    }

}

