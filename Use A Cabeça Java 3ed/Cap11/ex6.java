//Escreva um programa em Java para contar o número de relações chave-valor (tamanho) em um mapa.
import java.util.HashMap;
public class ex6{
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("as", 1);
        System.out.println(a.size()); 
    }
}