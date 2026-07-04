
//Create three classes Rectangle, Circle, and Square that implement the Shape interface.
//Implement the getArea() method for each of the three classes.
interface  Shape  {
    public double  getArea();
}
class Circle implements  Shape{
    private double radius;
    public void SetRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        double pi  = 3.14;
        double Area = pi * (radius*radius);
        return Area;
    }
}
class Square implements  Shape {
    private double side;
    public void SetSide(double side){
        this.side = side;
    }
    @Override
    public double  getArea(){
        double Area = side*side;
        return Area;
    }
}
class Rectangle implements  Shape{
    private double width;
    private double length;
    public void SetLength(double length){
        this.length = length;
    }
    public void SetWidth(double width){
        this.width = width;
    }
    @Override
    public double  getArea(){
        double Area = length *  width;
        return Area;
    }
}
public class ex1{
    public static void main(String[] args) {
        Circle  a = new Circle();
        a.SetRadius(2);
        a.getArea();
        System.out.println(a.getArea());
        Square B = new Square();
        B.SetSide(4);
        System.out.println(B.getArea());
        Rectangle C = new Rectangle();
        C.SetLength(5);
        C.SetWidth(5);
        System.out.println(C.getArea());
    }

}