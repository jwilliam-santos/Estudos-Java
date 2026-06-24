//Escreva um programa em Java para criar uma classe chamada Pessoa com variáveis ​​de instância privadas nome, idade e país. 
//Forneça métodos públicos getter e setter para acessar e modificar essas variáveis.
class Pessoa{
    private int idade;
    private String nome;
    private String Pais;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getPais(){
        return Pais;
    }
    public void setPais(String Pais){
        this.Pais = Pais;
    }

}
public class ex1{
    public static void main(String[] args){
        Pessoa a = new Pessoa();
        a.setNome("Jefferson");
        a.setIdade(55);
        a.setPais("Brasil");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("País: " + a.getPais());

    }
}