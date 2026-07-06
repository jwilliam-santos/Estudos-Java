//Write a Java program to create a class called "Cat" with instance variables name and age. 
//Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
class Cat{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
        
    
    public Cat(){
        name = "Unknown";
        age = 0;
    }
}
public class ex1{
    public static void main(String[] args) {
        Cat a = new Cat();
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }
}
