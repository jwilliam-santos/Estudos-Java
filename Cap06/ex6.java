
import java.util.ArrayList;

//Crie duas listas de números inteiros independentes, cada uma com 3 números de sua escolha. 
//Crie uma terceira lista inicialmente vazia e jogue todos os elementos das duas primeiras listas dentro dela.

public class ex6 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        ArrayList<Integer> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        System.out.println(c);
    }
}
