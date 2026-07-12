//Crie uma classe Pessoa com nome e idade. 
//Crie um array de 3 pessoas. 
//Tente imprimir o nome da pessoa[0] antes de instanciar o objeto (usando new).
//Veja o erro que aparece no console (o famoso NullPointerException).
class Pessoa{
    String nome;
    int idade;
}
public class ex7{
    public static void main(String[]args){
        Pessoa[] fila = new Pessoa[3];
        fila[0].nome ="Robson";
        fila[0] = new Pessoa();
    }
}