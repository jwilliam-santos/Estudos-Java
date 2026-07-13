/*Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
quantos positivos e quantos zeros foram inseridos. */
import java.util.ArrayList;
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Digite o primeiro numero"); 
        int b = a.nextInt();
        System.out.print("Digite o segundo numero"); 
        int c = a.nextInt();
        System.out.print("Digite o terceiro numero");
        int d = a.nextInt();
        System.out.print("Digite o quarto numero");
        int e = a.nextInt();
        System.out.print("Digite o quinto numero");
        int f = a.nextInt();
        ArrayList<Integer> k = new ArrayList<>();
        k.add(b);
        k.add(c);
        k.add(d);
        k.add(e);
        k.add(f);
        for(int i = 0; i < 5;i++){
            if (k.get(i) > 0){
                System.out.println("O número " + k.get(i) + " e maior que 0");
                ArrayList<Integer> S = new ArrayList<>();
                S.add(k.get(i));
                System.out.println("N° positivo "+ S);
            }
            if (k.get(i) < 0){
                System.out.println("O número " + k.get(i) + " e menor que 0");
                ArrayList<Integer> K = new ArrayList<>();
                K.add(k.get(i));
                System.out.println("N° negativos "+ K);
            }
        }
        


    }
}
