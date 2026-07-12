/*Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.*/
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Digite o Primeiro Inteiro");
        int b = a.nextInt();
        System.out.print("Digite o segundo inteiro");
        int c =a.nextInt();
        int diferença  = b-c;
        System.out.print("soma é " + b+c + " produto é " + b*c +  "diferença " + diferença  + " divisão " + b/c);

    }    
}
