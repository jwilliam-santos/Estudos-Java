//Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159.
//Create a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.
class Constants{
    public static double PI =3.14159;
    public static double Area(double radius){
        return PI * radius * radius;
    }
}
class ex4{
    public static void main(String[] args) {
        System.out.println(Constants.Area(5));
    }
}