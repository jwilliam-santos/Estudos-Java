//Escreva um programa em Java para criar uma classe chamada `Circle` com uma variável de instância privada `radius`.
//Forneça métodos públicos `getter` e `setter` para acessar e modificar a variável `radius`.
//Além disso, forneça dois métodos chamados `calculateArea()` e `calculatePerimeter()` que retornam a área e o perímetro calculados com base no valor atual de `radius`.

class Circle{
    private double radius;
    double pi = 3.14;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    void calculateArea(){
        double Area = pi*(radius*radius);
        System.out.println("Area: " + Area);
    }
    void calculatePerimeter(){
      double  Perimeter = 2*(pi*radius);
      System.out.println("Perimeter: " + Perimeter);
    }



}

public class ex4 {
    public static void main(String[] args){
        Circle a = new Circle();
        a.setRadius(5);
        a.calculateArea();
        a.calculatePerimeter();
    
    }
}
