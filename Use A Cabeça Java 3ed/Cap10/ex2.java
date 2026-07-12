//Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum. 
//Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".
class MathUtility{
    public static int Add(int a,int b){
            return a + b;
    }
}


public class ex2 {
    public static void main(String[] args) {
        System.out.println("The sum is "+ MathUtility.Add(1, 2));
    }
}
