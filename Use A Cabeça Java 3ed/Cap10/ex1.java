//Write a Java program to create a class called "Counter" with a static variable count. 
//Implement a constructor that increments count every time an object is created.
//Print the value of count after creating several objects.
public class ex1 {
    
    private static int count = 0;

    
    public ex1() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
     
        ex1 c1 = new ex1();
        ex1 c2 = new ex1();
        ex1 c3 = new ex1();

     
        System.out.println("Count: " + ex1.getCount());
    }
}
