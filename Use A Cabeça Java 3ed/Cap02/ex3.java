package Cap02;
//Escreva um programa em Java para criar uma classe chamada "Retângulo" com atributos de largura e altura.
// Calcule a área e o perímetro do retângulo.

class Retangulo{
    int largura;
    int altura;
}

public class ex3 {
    public static void main (String[]args){
        Retangulo x = new Retangulo();
        x.largura = 10;
        x.altura = 5;
        int area = x.largura * x.altura;
        System.out.print("A altura é " + area);


    }

}
