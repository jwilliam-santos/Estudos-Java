/*Os motoristas se preocupam com a quilometragem obtida por seus automóveis.
Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros) para cada viagem. 
O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. 
Todos os cálculos de média devem produzir
resultados de ponto flutuante. 
Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário. */
import java.util.Scanner;
class Carro{
    public static void Calcular(int gasolina, int kilometros){
        double KmPorL = kilometros/gasolina;
        System.out.println("O carro anda aproximadamente " + KmPorL + " por litro" );
    }
}
public class ex1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos litros de gasolina foram abastecidos ");
        int gasolina = input.nextInt();
        System.out.println("Digite quantos kilometros vão ser percorridos");
        int kilometros = input.nextInt();
        Carro.Calcular(gasolina,kilometros );
    }
}