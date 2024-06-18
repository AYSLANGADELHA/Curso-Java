import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** Fazer um programa que leia o número de um funcionário
        seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário.
         A seguir, mostre o número e o salário do funcionário
        com duas casas
        decimais. **/



        Scanner sc = new Scanner(System.in);

        double HorasTrabalhadas, ValorHora, Salário;

        System.out.print("Quantas horas você trabalha por dia: ");
        HorasTrabalhadas = sc.nextDouble();

        System.out.print("Qual valor da sua hora R$ ");
        ValorHora = sc.nextDouble();

        Salário = (HorasTrabalhadas * 28) * ValorHora;

        System.out.printf("Você trabalha %.0f horas por dia e o seu salário por mês é de R$ %.2f reais ", HorasTrabalhadas, Salário);


    }

}