import java.util.ArrayList;
//Crie um ArrayList com os números de 1 a 10. Use um laço tradicional para percorrer a lista:
// sempre que encontrar um número ímpar, use o método .set() para mudar o valor daquela posição para 0.
public class ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        for(int b  : a){
            if (b % 2 == 0){
                System.out.println(b);
                
            }
        }
    }
}