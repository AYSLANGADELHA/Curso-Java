import java.util.Locale;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        

        // declarando e instanciando listas
        List<String> list = new ArrayList<>();


        // adicionando elementos

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");


        // inserindo elemento

        list.add(2, "Marco");



        // descobrir o tamanho da lista

        System.out.println(list.size());


        /* remover elemento da lista
        apartir da comparação dele com o outro */


        // list.remove(1);
        //list.remove("Anna");

        for (String x : list){
            System.out.println(x);
        }


        System.out.println("---------------------------------------");
        // removendo elementos que atendem a um precado
        //função LAMBDA


        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }



        System.out.println("---------------------------------------");

        // para encontrar uma posição do elemento

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));


        // deixar na lista apenas quem tem o nome começando com M

        System.out.println("------------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        // result é a variável


        for (String x : result){
            System.out.println(x);
        }


        System.out.println("-----------------------------------");
        // encontrar elemento da lista que atenda a um certo predicado
        // OBS: nome que comece com 'A'

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);




    }
}
