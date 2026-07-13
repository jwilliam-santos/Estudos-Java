/* Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma
fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua
classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo
preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço
por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
capacidades da classe Invoice.*/
class  Invoice{
    private String número;
    private String descrição;
    private int item;
    private double preço;
    public void SetNum(String número){
        this.número = número;
    }
    public void SetDes(String descrição){
        this.descrição = descrição;
    }
    public void SetItem(int item){
        this.item = item;
    }
    public void SetPreço(double preço){
        this.preço = preço;
    }
    public String GetNum(){
        return número;
    }
    public String GetDes(){
        return descrição;
    }
    public int GetItem(){
        return item;
    }
    public double GetPre(){
        return preço;
    }
    public void getInvoiceAmount(){
        if (preço<0){
            preço = 0;
        }
        double fatura = preço*item;
        System.out.println("A fatura é "+ fatura);
    }
}
public class ex1{
    public static void main(String[] args) {
        Invoice a = new Invoice();
        a.SetDes("sla");
        a.SetItem(50);
        a.SetNum("21");
        a.SetPreço(520);
        a.getInvoiceAmount();
    }
}