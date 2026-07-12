//Escreva um programa em Java para iterar por todos os elementos de uma lista de arrays.
import java.util.ArrayList;
public class ex5 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("true");
        a.add("false");
        a.add("false");
        a.add("true");
        for(String c: a){
            System.out.println(c);
        }
    }
}
