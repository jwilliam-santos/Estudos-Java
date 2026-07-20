/* Escreva um método distance para calcular a distância entre dois pontos (x1, y1) e (x2, y2). Todos os números e valores de retorno devem ser do tipo double. Incorpore esse método a um aplicativo que permite que o usuário insira as coordenadas
de pontos. */
import java.util.Scanner;
class Distancia{
    public static void CalcularD(double x1,double x2,double y1,double y2){
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("\nDistancia é %.2f",d);
    }
}
public class ex2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor primeiro X e o Primeiro Y respectivamente");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("\nDigite o valor segundo X e o segundo Y respectivamente");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        Distancia.CalcularD(x1, x2, y1, y2);


    }
}