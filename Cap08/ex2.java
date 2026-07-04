//Write a Java program to create an abstract class Animal with an abstract method called sound().
//Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.
abstract  class Animal{
    void sound(){
        System.out.println("Generic sound");
    }
}
class Lion extends  Animal{
    @Override
    void sound(){
        System.out.println("Lion sound");
    }
}
class Tiger extends  Animal{
    @Override
    void sound(){
        System.out.println("Tiger sound");
    }
}
public class ex2{
    public static void main(String[] args) {
        Lion a = new Lion();
        a.sound();
        Tiger b  = new Tiger();
        b.sound();
    }
}