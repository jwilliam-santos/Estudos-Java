//Escreva um programa em Java para criar uma classe chamada Celular com variáveis ​​de instância privadas marca, modelo e armazenamento.
//Forneça métodos getter e setter públicos para acessar e modificar essas variáveis.
//Adicione um método chamado aumentar_armazenamento() que recebe um valor inteiro e incrementa o storageCapacity por esse valor.
class Celular{
    private String marca;
    private String modelo;
    private int armazenamento;
    public int getArmazenamento(){
        return armazenamento;
    }
    public String getMarca(){
        return marca;
    }
    public String modelo(){
        return modelo;
    }
    public void setArmazenamento(int armazenamento){
        this.armazenamento = armazenamento;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void aumentar_armazenamento(int novo_armazenamento){
        armazenamento += novo_armazenamento;
    }

}




public class ex7 {
    public static void main(String[]args){
        Celular a = new Celular();
        a.setArmazenamento(128);
        a.setMarca("Apple");
        a.setModelo("Iphone 15");
        System.out.println(a.getArmazenamento());
        a.aumentar_armazenamento(128);
        System.out.println(a.getArmazenamento());
        
    }
}
