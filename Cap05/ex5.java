//Dado o array double[] notas = {8.5, 7.0, 9.2, 6.8};, 
//crie um programa que calcule e exiba a média aritmética dessas notas utilizando obrigatoriamente o for aprimorado (for-each).
public class ex5{
    public static void main(String[]args){
        double[]   notas = {8.5,7.0,9.2,6.8};
        double tamanho = notas.length;
        //double media = notas / tamanho;
        //System.out.println(media)
        double totalsoma = 0;
        for( double  i:notas){
            totalsoma += i;
        }
        double media = totalsoma /tamanho;
        System.out.println(media);
    }
}