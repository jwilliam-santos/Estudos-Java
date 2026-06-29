//Escreva um programa em Java para criar uma classe chamada `Vehicle` com um método chamado `drive()`. 
//Crie uma subclasse chamada `Car` que sobrescreva o método `drive()` para imprimir "Consertando um carro".
class Vehicle{
    public void drive(){
        System.out.println("Dirigindo");
    }
}

class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Consertando um carro");
    }
}

public class ex3 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.drive();
    }
}
