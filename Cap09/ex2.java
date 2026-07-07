/*Crie um método chamado simularTroca dentro de uma classe qualquer. 
Dentro desse método, você deve instanciar dois objetos da classe Jogador (com as variáveis de referência que você escolher). 
Escreva o código de forma que, antes do método terminar,
um dos objetos fique totalmente inacessível e elegível para o GC, mas você não pode usar a palavra-chave null em nenhum momento. */
class a{
    public void simularTroca(){
        String  j1 = " Cr7";
        String j2 = "Messi";
        j1 = j2;
        System.out.println(j1 + " e " + j2);
    }
}


public class ex2 {
    
    public static void main(String[] args) {
        a A = new a();
        A.simularTroca();
    }
}
