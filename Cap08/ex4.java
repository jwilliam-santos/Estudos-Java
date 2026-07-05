//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
//Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
abstract  class Shape{
    void calculateArea(){}
    void calculatePerimeter(){}
}
class Circle extends  Shape{
    private double radius;
    public void SetRadius(double radius){
        this.radius = radius;
    }
    @Override
    void  calculateArea(){
        double Area = Math.PI * (radius*radius);
        System.out.println(Area);
    }
    @Override
    void   calculatePerimeter(){
        double Perimeter = 2*(Math.PI*radius);
        System.out.println(Perimeter);
    }
}
class Triangle extends Shape{
    private double base;
    private double height;
    public void SetBase(double base){
        this.base = base;
    }
    public void SetHeight(double height){
        this.height = height;
    }
    @Override
    void calculateArea(){
        System.out.println((base*height) /2);
    }
    @Override 
    void  calculatePerimeter(){
        System.out.println("0.0");
    }

}

public class ex4 {
    public static void main(String[] args) {
        Circle a = new Circle();
        a.SetRadius(5);
        a.calculateArea();
        a.calculatePerimeter();
        Triangle b = new Triangle();
        b.SetBase(5);
        b.SetHeight(5);
        b.calculateArea();
        b.calculatePerimeter();

    }
}
