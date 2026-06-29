import java.util.ArrayList;
//Crie um ArrayList de números decimais (Double) pré-preenchido com 6 notas.
//Remova a nota que está no índice 3 usando o método .remove() e exiba o tamanho final da lista na tela com .size().
public class ex3 {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>();
        a.add(5.5);
        a.add(2.6);
        a.add(1.1);
        a.add(9.9);
        a.add(10.0);
        a.add(9.9);
        a.remove(3);
        for(double b : a ){
            System.out.println(b);
        }
    }
    
}
