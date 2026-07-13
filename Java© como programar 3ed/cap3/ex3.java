/*Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int).
Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método
set e um get para cada variável de instância. Apresente um método displayDate que exiba mês, dia e ano separados por barras normais
(/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date. */
class Date{
    private int mes;
    private int dia;
    private int ano;
    public void SetMes(int mes){
        this.mes = mes;
    }
    public void SetDia(int dia){
        this.dia  = dia;
    }
    public void SetAno(int ano){
        this.ano = ano;
    }
    public int GetMes(){
        return mes;
    }
    public int GetDia(){
        return dia;
    }
    public int GetAno(){
        return ano;
    }
    public void displayDate(){
        System.out.println("Hojé e dia "+ dia + " do mes " + mes + " do ano "+ ano);
    }

}
public class ex3 {
    public static void main(String[] args){
        Date a = new Date();
        a.SetDia(5);
        a.SetMes(2);
        a.SetAno(2020);
        a.displayDate();
    }
}
