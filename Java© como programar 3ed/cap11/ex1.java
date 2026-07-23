/*Escreva um programa em Java que lance uma exceção e a capture usando um bloco try-catch.*/
import java.util.Scanner;
public class ex1{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        try{
            System.out.print("Digite o inteiro dividendo");
            double dividendo = a.nextDouble();
            System.out.print("\nDigite o inteiro divisor");
            double divisor = a.nextDouble();
            double resultado = dividendo/divisor;
            System.out.printf("\nResultado: %.2f",resultado);
        } catch(Exception e){
            System.out.printf("\nErros: %s",e);
        }
        
        a.close();
    }
}