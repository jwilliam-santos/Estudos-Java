//Elabore um programa que calcule e imprima o produto de três inteiros
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro inteiro");
        int a = input.nextInt();
        System.out.print("Digite o segundo inteiro");
        int b = input.nextInt();
        System.out.print("Digite o terceiro inteiro");
        int c = input.nextInt();
        int produto = a * b* c;
        System.err.println("O produto é "+ produto);
    }
}
