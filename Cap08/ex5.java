//Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void.
// Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
interface Animal{
    void Bark();
}
class Dog implements  Animal{
    @Override
    public void Bark(){
        System.out.println("Dog is barking");
    }

}



public class ex5 {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.Bark();
    }
}
