import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Quantos alunos para o curso A: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            int number = sc.nextInt();
            a.add(number);

        }

        System.out.print("Quantos alunos para o curso B: ");
        n = sc.nextInt();

        for (int i=0; i<n; i++){
            int number = sc.nextInt();
            b.add(number);

        }

        System.out.print("Quantos alunos para o curso C: ");
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            int number = sc.nextInt();
            c.add(number);

        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total de Estudantes " + total.size());

        sc.close();


    }

}