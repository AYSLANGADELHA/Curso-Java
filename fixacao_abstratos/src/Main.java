import entities.Company;
import entities.Individual;
import entities.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<People> list = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Taxpayer " + i + "º data: ");
            System.out.print("Individual or Company (i/c) : ");
            sc.nextLine();
            char resp = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();


            if (resp == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                Individual x = new Individual(name, anualIncome, health);
                list.add(x);
            } else {
                System.out.print("Number of employees: ");
                int employee = sc.nextInt();
                list.add(new Company(name, anualIncome, employee));
            }

        }
        System.out.println();
        System.out.println("TAXES PAID: ");

        for (People people : list) {
            System.out.println(people.getName() + ": $ " + String.format("%.2f", people.tax()));
        }
        double sum = 0.0;
        for(People people : list){
            sum += people.tax();
        }

        System.out.println();

        System.out.println("TOTAL TAX: $ " + String.format("%.2f", sum));



        sc.close();
    }
}