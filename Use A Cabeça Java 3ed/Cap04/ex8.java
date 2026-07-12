//Escreva um programa em Java para criar uma classe chamada Desktop com variáveis ​​de instância privadas marca, cpu e Memoria ram. 
//Forneça métodos públicos getter e setter para acessar e modificar essas variáveis.
// Adicione um método chamado `upgradeRam()` que recebe um valor inteiro e incrementa o valor de Memoria ram por esse valor.
class Celular{
    private String marca;
    private String modelo;
    private int MemoriaRam;
    public int getMemoriaRam(){
        return MemoriaRam;
    }
    public String getMarca(){
        return marca;
    }
    public String modelo(){
        return modelo;
    }
    public void setMemoriaRam(int MemoriaRam){
        this.MemoriaRam = MemoriaRam;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void aumentar_ram(int novo_armazenamento){
        MemoriaRam += novo_armazenamento;
    }

}




public class ex8 {
    public static void main(String[]args){
        Celular a = new Celular();
        a.setMemoriaRam(16);
        a.setMarca("Apple");
        a.setModelo("Iphone 15");
        System.out.println(a.getMemoriaRam());
        a.aumentar_ram(16);
        System.out.println(a.getMemoriaRam());
        
    }
}

