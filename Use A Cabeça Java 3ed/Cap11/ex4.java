//Escreva um programa em Java para obter o número de elementos em um conjunto hash.
import java.util.HashSet;

public class ex4 {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<>();
        a.add("Algo"); 
        a.add("algo");
        System.out.println(a.size());
    }
}
