/* Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça um
método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de
teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee. */
class Employee{
    private String nome;
    private String sobrenome;
    private double salario;
    public void SetNome(String nome){
        this.nome = nome;
    }
    public void SetSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void SetSalario(double salario){
        if (salario<0){
            System.out.println("erro, salario não definido");
        }
        if (salario>0){
            this.salario = salario;
        }
    }
    public void GetSalarioAnual(){
        if (salario == 0.0){
            System.out.println("Defina um Salario");
        }
        if (salario != 0.0){
            double  SalarioAnual = (salario*12) * 1.10;
            System.out.println("seu Salario Anual é de " + SalarioAnual);
        }
    }
    public String GetNome(){
        return nome;
    }
    public String getSobreNome(){
        return sobrenome;
    }
    public double GetSalario(){
        return salario;
    }

}

public class ex2 {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.SetSalario(100);
        a.GetSalarioAnual();
    }
}
