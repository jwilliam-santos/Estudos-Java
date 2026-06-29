
import java.util.ArrayList;
//Crie uma lista com 5 nomes de peças de computador.
//Use o método .contains() para verificar se o item "Processador Xeon" está salvo na lista e exiba true ou false no terminal.

public class ex4 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Processador Xeon");
        a.add("Rx7600");
        a.add("X99");
        a.add("600w");
        a.add("ssd");
        if (a.contains("Processador Xeon") == true ){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("Fim");
    }

        
}
