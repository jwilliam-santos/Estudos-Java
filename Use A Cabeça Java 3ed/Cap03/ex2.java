//Crie um array de 5 números inteiros. Use um laço para imprimir a soma de todos eles.
public class ex2{
    public static void main(String[] args){
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        int soma_array = array[0] + array[1]+ array[2] + array[3] + array[4];
        System.out.print("A Soma dos valores é " + soma_array );
    }
}
