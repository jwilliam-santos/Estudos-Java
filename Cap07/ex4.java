//Escreva um programa em Java para criar uma classe chamada Employee com métodos chamados work() e getSalary().
//Crie uma subclasse chamada HRManager que sobrescreva o método work() e adicione um novo método chamado addEmployee().
class Employee{
    public void work(){
        System.out.println("Trabalhando como um miseravel");
    }
    public void getSalary(){
        System.out.println("Um salario minimo em 30 dias no Pix");
    }
}

class HRManager extends Employee{
    @Override
    public void work(){
        System.out.println("Trabalha meio periodo para 2 salarios minimos, parabens");
    }
    public void addEmployee(){
        System.out.println("Sla oq é isso kkkkkkkkk");
    }
}

public class ex4 {
    public static void main(String[] args) {
        HRManager a = new HRManager();
        a.work();
        a.getSalary();
        a.addEmployee();
    }
    
}
