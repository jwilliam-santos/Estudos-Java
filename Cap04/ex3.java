//Escreva um programa em Java para criar uma classe chamada `Rectangle` com variáveis ​​de instância privadas `length` e `width`. 
//Forneça métodos públicos `getter` e `setter` para acessar e modificar essas variáveis.
class Rectangle{
    private double length;
    private double width;
    public double getLength(){
        return length;

    }
    public double getWidth(){
        return width;
    }
    public void setLength(Double length){
        this.length = length;
    }
    public void setWidth(Double width){
        this.width = width;
    }

}
public class ex3 {
    public static void main(String[] args){
        Rectangle a = new Rectangle();
        a.setLength(1.9);
        a.setWidth(1.9);
        System.out.println("Comprimento: " +  a.getLength());
        System.out.println("Largura: "+ a.getWidth());

    }
}
