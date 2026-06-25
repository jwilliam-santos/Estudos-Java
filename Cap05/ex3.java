//Escreva um programa que calcule e exiba a soma de todos os números inteiros de 1 a 50.
public class ex3{
    public static void main(String[] args) {
        int x = 0;
        for(int i=1;i<=50;i++){
            System.out.println(i+x);
            x+= i;
        }
    }
}
