//Dado o array int[] numeros = {12, 45, 7, 91, 23};, 
//crie um programa que percorra a estrutura e encontre qual é o maior número contido nela, exibindo o resultado no final.
public class ex7{
    public static void main(String[] args) {
        int[] numeros = {12, 45, 7, 91, 23};
        int maior_valor = numeros[0];
        for( int  num:numeros){
            if(num> maior_valor){
                maior_valor = num;
            }

        }
        System.out.println(maior_valor);
    }
} 