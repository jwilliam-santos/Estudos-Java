/*Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. 
Implement a default constructor and a parameterized constructor that takes all three instance variables. 
Use constructor chaining to initialize the variables. Print the values of the variables. */
class Student{
    public Student(int StudentId, String studentname){
        int a = StudentId;
        System.out.println(a);
        String b = studentname;
        System.out.println(b);
    }
}



public class ex5 {
    public static void main(String[] args) {
        Student a  = new Student(123, "Java");
    }
}
