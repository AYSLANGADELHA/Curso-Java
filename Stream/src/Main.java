import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // toArray converte para Vetor

        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = list.stream().map(x -> x*10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<Integer> st2 = Stream.iterate(0, x -> x+2);
        System.out.println(Arrays.toString(st2.limit(10).toArray()));


        // Sequência fibonacci com Stream








        Stream <Long> st3 = Stream.iterate(new Long[] {0l,1l}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
















    }
}