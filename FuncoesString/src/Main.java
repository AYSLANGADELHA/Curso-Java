import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String original = "abcde FGHIJ ABC abc DEFG   ";
        String s01 = original.toLowerCase(); /** transformar para minúsculas **/
        String s02 = original.toUpperCase(); /** transformar para maiúsculas **/
        String s03 = original.trim(); /** remove os espações inúteis **/
        String s04 = original.substring(2); /** ler da posição 2 em diante **/
        String s05 = original.substring(2, 9); /** ler do caractere 2 até 8 **/
        String s06 = original.replace('a', 'x'); /** sempre que achar um a, troca pelo x **/
        String s07 = original.replace("abc", "xy");  /** sempre que achar um abc, troca por xy **/
        int i = original.indexOf("bc"); /** qual posição da string bc na string original **/
        int j = original.lastIndexOf("bc"); /** ultima ocorrência do bc **/

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2,9): -" + s05 + "-");
        System.out.println("replace('a','x'): -" + s06 + "-");
        System.out.println("replace('abc','xy'): -" + s07 + "-");
        System.out.println("indexOf('bc'): " + i);
        System.out.println("lastIndexOf('bc'): " + j);



        /** operação split **/

        String s = "Ayslan Souza Gadelha";
        String[] vect = s.split(" ");

        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];



        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        System.out.println("----------------");

        System.out.println(vect[2]);
        System.out.println(vect[1]);
        System.out.println(vect[0]);





    }
}
