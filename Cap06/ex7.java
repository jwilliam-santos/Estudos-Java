import java.util.ArrayList;
//Crie uma lista de String com 4 nomes de marcas de hardware.
//Use o método .indexOf() para encontrar e exibir a posição exata de uma das marcas.
//Em seguida, use o método .clear() para apagar a lista inteira e use o .isEmpty() para confirmar se ela ficou vazia.

public class ex7 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Mancer");
        a.add("Pichau");
        a.add("Corsair");
        a.add("Amd");
        a.clear();
        if (a.isEmpty() ==  true){
            System.out.println("Vazia");
        }
        
    }

}
