//Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
//Create two subclasses Bird and Cat.
// Override the Sound() method in each subclass to make a specific sound for each animal.
class Animal{
    void sound(){
        System.out.println("Generic sound");
    }
}
class Bird extends Animal{
    @Override
    void sound(){
        System.out.println("Bird Sound");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat Sound");
    }
}
public class ex3{
    public static void main(String[] args) {
        Bird a = new Bird();
        a.sound();
        Cat b = new Cat();
        b.sound(); 
    }
}