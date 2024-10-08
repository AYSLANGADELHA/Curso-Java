import entities.Product;

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

        List<Product> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        System.out.println("Folder created: " + success);

        // Arquivo de Saída

        String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2].trim());

                list.add(new Product(name, price, quantity));


                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error writing file " + e.getMessage());
        }

        sc.close();
    }
}
