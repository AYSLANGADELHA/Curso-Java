import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("LARGURA: ");
        double largura = sc.nextDouble();

        System.out.print("COMPRIMENTO: ");
        double comprimento = sc.nextDouble();

        System.out.print("Metro Quadrado: ");
        double MetroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * MetroQuadrado;

        System.out.printf("ÁREA = %.2f%n", area);
        System.out.printf("PREÇO = %.2f%n", preco);

        sc.close();
    }
    
}