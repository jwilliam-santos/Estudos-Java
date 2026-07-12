/*Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...] */
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner a  = new Scanner(System.in);
        System.out.print("Digite o primeiro inteiro");
        int b = a.nextInt();
        System.out.print("Digite o segundo inteiro");
        int c = a.nextInt();
        System.out.print("Digiteo terceiro inteiro");
        int d = a.nextInt();
        int media = b + c + d /3;
        
        System.err.println("A media é "+ Math.floor(media));
    }
}
