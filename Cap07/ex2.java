//Escreva um programa em Java para criar uma classe chamada `Shape` com um método chamado `getArea()`. 
//Crie uma subclasse chamada `Rectangle` que sobrescreva o método `getArea()` para calcular a área de um retângulo.
class Shape{
    public void getArea(){
        System.out.println("0");
    }
}
class Rectangle extends Shape{
    private  double largura;
    private  double altura;
    public void A(double largura,double altura){
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public void getArea(){
        double area = largura * altura;
        System.out.println("A area é "+ area);
    }

}



public class ex2 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.A(5, 5);
        a.getArea();
    }
}
