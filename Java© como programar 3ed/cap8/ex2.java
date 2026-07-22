/*Crie uma classe Rectangle com os atributos length e width, cada um dos quais assume o padrão de 1. Forneça
os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento (length) e a largura
(width). Os métodos set devem verificar se length e width são, cada um, números de ponto flutuante maiores que 0,0 e menores que
20,0. Escreva um programa para testar a classe Rectangle. */
class Rectangle{
    private double length ;
    private double width;

    public Rectangle(double length,double width) {
        this.length = length;
        this.width = width;
        if(length  < 0.0 || length > 20.0){
            length = 1;
        }    
        if (width <0.0 || width > 20.0){
            width = 1;
        }
    }
    public void Calcular(){
        double area = length * width;
        double perimetro = length + width;
        System.out.printf("A area é %.2f e perimetro e %.2f",area,perimetro);
    }
    
    
}
public class ex2 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(5, 5);
        a.Calcular();
    }
}
