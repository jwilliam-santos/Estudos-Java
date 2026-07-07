//Write a Java program to create a class called Dog with instance variables name and color.
//Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. 
//Print the values of the variables.
class Dog{
    public Dog(String name,String color){
        String a = name;
        System.out.println(a);
        String b = color;
        System.out.println(b);
    }
}
public class ex3{
    public static void main(String[] args) {
        Dog a = new Dog("Thor", "White");
    }
}