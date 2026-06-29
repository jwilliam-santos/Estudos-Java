import java.util.ArrayList;
//Use o método .set() para substituir o segundo elemento da lista (índice 1) por um jogo novo e exiba a lista completa atualizada.
//Crie uma lista de String contendo o nome de 4 jogos. 
public class ex2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("GTA 6");
        a.add("Zelda");
        a.add("Minecraft");
        a.add("Project Zomboid");
        a.set(1,"Shoot the Corner");
        for(String b: a){
            System.out.println(b);
        }
    }
}
