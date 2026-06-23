//Crie uma classe Carro com modelo e ano. 
// Crie um array de 2 Carros. 
//Faça o carro[1] = carro[0].
// Mude o modelo do carro[0] e imprima o modelo do carro[1].
class Carro{
    String modelo;
    int ano;
}
public class ex3{
    public static void main(String[] args){
        Carro[] carro = new Carro[2];
        carro[0] = new Carro();
        carro[0].modelo = "lamborgini";
        carro[0].ano = 2020;
        carro[1] = carro[0];
        carro[0].modelo = "Ferrari";
        System.out.println("Modelo carro[0]: " + carro[0].modelo + " Modelo carro[1] "+ carro[1].modelo);


    }
}
