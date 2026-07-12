package Cap02;
//Escreva um programa em Java para criar uma classe chamada "Círculo" com um atributo raio. 
//Você pode acessar e modificar esse atributo. Calcule a área e a circunferência do círculo.

class Circulo{
    int raio;
    double pi;
} 

public class ex4 {
    public static void main(String[]args){
        Circulo x = new Circulo();
        x.raio = 5;
        x.pi = 3.14;
        double circunferencia = 2*(x.raio*x.pi);
        double area = x.pi * (x.raio*x.raio);
        System.out.print("A área é , a circunferencia vem em seguida"  + area   + circunferencia );
    }
}
