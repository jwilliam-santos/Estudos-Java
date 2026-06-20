package Cap02;
//Write a Java program to create a class called "Person" with a name and age attribute. 
//Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
class Person{
    int age;
    String name;
}

public class ex1 {
    public static void main (String[]args){
        Person Jefferson = new Person();
        Jefferson.age = 59;
        Jefferson.name =  "Jefferson da Silva";
        System.out.println("Nome:"+ Jefferson.name + " Idade:" + Jefferson.age);
        Person Carlos = new Person();
        Carlos.age = 57;
        Carlos.name = "Carlinhos da Silva Costa de Bragança";
        System.out.println("Nome:"+ Carlos.name + " Idade:"+ Carlos.age);
    }

}
