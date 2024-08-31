import java.io.File;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {


    File file = new File("C:\\Users\\aysla\\Documents\\java.txt");
    Scanner sc = null;
    try {
        sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
    catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }
    finally{
        if (sc != null) {
            sc.close();
        }
    }















    }
}
