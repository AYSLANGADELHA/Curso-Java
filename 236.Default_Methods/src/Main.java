import service.BrazilInterestService;
import service.InterestService;
import service.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // do java 8 em diante a interface pode conter métodos concretos

        /*                          DEFAULT METHODS / DEFENDER METHODS

            Intenção básica é para implementação padrão para métodos, e evitar:

            - repetição de implementação em todas as classes que implemente a INTERFACE
            - a necessidade de se criar classes abstratas para prover reuso da implementação

            VANTAGENS

            - manter a retrocompatibilidade com sistemas existentes
            - permitir que "interfaces funcionais" (que devem conter apenas um método)
            possam prover outras operações padrão reutilizável.

         */


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();

        /*

        Sim: agora as interfaces podem prover reuso

        Sim: forma de herança múltipla
        - Mas o compilador reclama se houver mais de um método
        com a mesma assinatura, obrigando a sobrescreve-lo

        - INTERFACES ainda são bem diferentes de classes abstratas.
        - INTERFACES não possuem recursos tais como construtores e atributos.

         */


    }
}