//Escreva um programa em Java para criar uma classe chamada Animal com um método chamado makeSound().
// Crie uma subclasse chamada Cat que sobrescreva o método makeSound() para latir.
class Animal{
    public void makeSound(){
        System.out.println("Barulho");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Latido");
    }
}
public class ex1{
    public static void main(String[] args) {
        Cat rodolfo = new Cat();
        rodolfo.makeSound();
    }
}