//Escreva um programa em Java para criar uma classe chamada "BankAccount" com métodos chamados deposit() e withdraw().
//Crie uma subclasse chamada SavingsAccount que sobrescreva o método withdraw() para impedir saques caso o saldo da conta fique abaixo de cem.
class BankAccount{
    protected double dinheiro;
    public void ColocarDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }
    public void deposit(double deposito){
        System.out.println("Depositando Dinheiro");
        dinheiro += deposito;
    }
    public void withdraw(double deposito){
        System.out.println("Sacando dinheiro");
        dinheiro -= deposito;
    }
}

class SavingAccount extends BankAccount{
    @Override
    public void withdraw(double deposito){
        if(dinheiro - deposito  > 100){
            System.out.println("Sacando dinheiro");
            dinheiro -= deposito;
        }
        else{
            System.out.println("Tu fica tão pobre que tu vai dever ");
        }
    }
}

public class ex5 {
    public static void main(String[] args) {
        SavingAccount a = new SavingAccount();
        a.deposit(10000);
        a.withdraw(19999999);
    }
}
