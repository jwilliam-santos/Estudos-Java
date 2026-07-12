import java.util.ArrayList;
//Crie um ArrayList de números inteiros (Integer), adicione 5 valores manualmente usando .add() e exiba a soma de todos os elementos na tela utilizando um laço for-each.
public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(4);
        inteiros.add(5);
        for( int s:inteiros){
            System.out.println(s);
        }
    }
}