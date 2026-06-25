//Escreva um programa em Java para criar uma classe chamada "Livro" com variáveis ​​de instância privadas `título`, `autor` e `preço`. 
//Forneça métodos públicos getter e setter para acessar e modificar essas variáveis.}
//Adicione um método chamado `aplicarDesconto()` que recebe uma porcentagem como parâmetro e reduz o preço por essa porcentagem.
class Livro{
    private  String titulo;
    private String autor;
    private double preço;
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public double getPreço(){
        return preço;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setPreço(double preço){
        this.preço = preço;
    }
    public void aplicarDesconto(double porcentagem){
        if (porcentagem > 0 && porcentagem <100){
            this.preço -= this.preço *(porcentagem/100);
        }
    }
}

public class ex6 {
    public static void main(String[]args){
        Livro a = new Livro();
        a.setPreço(100);
        a.setTitulo("harry poter 2 e a camara secreta");
        a.setAutor("JK rowling");
        a.aplicarDesconto(10);
        System.out.println(a.getPreço());
    }
    
}
