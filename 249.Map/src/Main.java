import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

       cookies.put("username", "maria");
       cookies.put("email", "maria@gmail.com");
       cookies.put("phone","99719122" );

       // para remover uma chave
       cookies.remove("email");

       // para adicionar uma chave e o valor da chave
       cookies.put("phone", "40028922"); // sobreescreveu

        // pra saber se tem a chave passada como argumento
        System.out.println("Tem a chave fone: " + cookies.containsKey("phone"));

        // pegar o valor da chave "phone"
        System.out.println("Phone number: " + cookies.get("phone"));

        // tentando pegar um valor que não exite
        System.out.println("Email: " + cookies.get("email"));

        // para saber o tamanho do map
        System.out.println("Size: " + cookies.size());


        System.out.println("Todos os Cookies: ");

        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));

        }


    }
}