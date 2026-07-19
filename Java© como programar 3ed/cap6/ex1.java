/*Escreva um método qualityPoints que insere a média de um aluno e retorna 4 se for 90 a 100, 3 se 80 a 89, 2 se 70 a 79, 1 se 60 a 69
e 0 se menor que 60. Incorpore o método a um aplicativo que lê um valor a partir do usuário e exibe o resultado. */
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.printf("Digite a media do aluno");
        int media = inputs.nextInt();
        if (media >= 90 && media <= 100 ){
            System.out.println("4");
        }
        else if (media >= 80 && media <= 89 ){
            System.out.println("3");
        }
        else if (media >= 70 && media <= 79 ){
            System.out.println("2");
        }
        else if (media >= 70 && media <= 79 ){
            System.out.println("1");
        }
        else if (media >= 60 && media <= 69 ){
            System.out.println("0");
        }
        else if (media > 100 && media < 0 ){
            System.out.println("Digite a nota menor que 100 ou maior que 0");
        }
        
    
    }
}
