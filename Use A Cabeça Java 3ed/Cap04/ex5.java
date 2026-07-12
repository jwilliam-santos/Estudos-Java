//Escreva um programa em Java para criar uma classe chamada Carro com variáveis ​​de instância privadas nome_da_empresa, nome_do_modelo, ano e quilometragem. 
//Forneça métodos públicos getter e setter para acessar e modificar as variáveis ​​nome_da_empresa, nome_do_modelo e ano. 
//No entanto, forneça apenas um método getter para a variável quilometragem.
class Carro{
    private int ano;
    private double quilometragem;
    private String nome_empresa;
    private String modelo;
    public double getQuilometragem(){
        return quilometragem;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setQuilometragem(double quilometragem){
        this.quilometragem = quilometragem;
    }
    public void setNome_empresa(String nome_empresa){
        this.nome_empresa = nome_empresa;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
public class ex5 {
    public static void main(String[] args){
        Carro a = new Carro();
        a.setAno(2011);
        a.setQuilometragem(5000);
        System.out.println("Quilometragem: " + a.getQuilometragem());
    
        

    }

}
