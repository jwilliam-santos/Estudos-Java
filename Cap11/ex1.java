//Escreva um programa em Java para criar uma lista de arrays, adicionar algumas cores (strings) e imprimir a coleção.
import java.util.ArrayList;
public class ex1{
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList();
        a.add("Blue");
        a.add("Red");
        a.add("Yellow");
        a.add("Green");
        System.out.println("As cores são: "+ a);
    }
}