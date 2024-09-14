import services.PrintService;
import services.PrintServiceString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}