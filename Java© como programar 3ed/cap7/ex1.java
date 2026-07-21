/*Escreva instruções que realizam as seguintes operações de um array unidimensional:
a) Configure os 10 elementos do array de inteiros counts como zeros.
b) Adicione um a cada um dos 15 elementos do array de inteiros bonus.
c) Exiba os cinco valores de array de inteiros bestScores em formato de coluna. */
public class ex1{
    public static void main(String[] args) {
        int[] counts = {0,0,0,0,0,0,0,0,0,0};
        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length;i++){
            bonus[i]++;
            System.out.println(bonus[i]);
        }
        
    }
}