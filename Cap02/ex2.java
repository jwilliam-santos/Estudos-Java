package Cap02;
//Escreva um programa em Java para criar uma classe chamada "Cachorro" com os atributos nome e raça. 
//Crie duas instâncias da classe "Cachorro", e as imprima-as

class Cachorro{
    String name;
    String raça;
}



public class ex2 {
    public static void main(String[]args){
        Cachorro Pitbull = new Cachorro();
        Pitbull.name = "anjinho";
        Pitbull.raça = "rotvailer";
        System.out.println("Nome:"+ Pitbull.name + "raça"+ Pitbull.raça + "OPA");

    }
}
