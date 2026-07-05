//Write a Java program to create a base class Shape with a method called calculateArea(). 
//Create three subclasses: Circle, Rectangle, and Triangle.
// Override the calculateArea() method in each subclass to calculate and return the shape's area.
class Shape{
    double  calculateArea(){return 0.0;}
}
class Circle extends  Shape{
    private double radius;
    public void SetRadius(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        double Area = Math.PI * (radius*radius);
        return Area;
    }
}
class Rectangle extends  Shape{
    private double weight;
    private double length;
    public void SetWeight(double weight){
        this.weight = weight;
    }
    public void SetLength(double length){
        this.length =  length;
    }
    @Override
    double calculateArea(){
        double Area = weight*length;
        return Area;
    }
}


public class ex6 {
    public static void main(String[] args) {
        Circle a = new Circle();
        a.SetRadius(5);
        System.out.println(a.calculateArea());

        Rectangle b = new Rectangle();
        b.SetLength(5);
        b.SetWeight(5);
        System.out.println(b.calculateArea());
    }

}
