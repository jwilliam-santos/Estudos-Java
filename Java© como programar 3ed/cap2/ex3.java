/*Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilize
as técnicas mostradas na Figura 2.15. */
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro");
        int b = a.nextInt();
        System.out.print("Digite o segundo número inteiro");
        int c = a.nextInt();
        if(b == c){
            System.out.println("These numbers are equal");
        }
        if (b>c){
            System.out.println("B is larger");

        }
        if (c>b){
            System.out.println("C is larger");
        }
    }

}
