//Escreva um programa em Java para implementar uma expressão lambda que calcule a soma de dois números inteiros.
interface sum{
    int sum(int a,int b);
}
class sum1 implements sum{
    @Override
    public int sum(int a,int b){
        return a+b;
    }
}
public class ex1{
    public static void main(String[] args) {
        sum1 sum2 = new sum1();
        System.out.println(sum2.sum(2, 2));
    }
    
}