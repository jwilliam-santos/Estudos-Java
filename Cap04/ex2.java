//Escreva um programa em Java para criar uma classe chamada `BankAccount` com variáveis ​​de instância privadas `accountNumber` e `balance`. 
//Forneça métodos públicos getter e setter para acessar e modificar essas variáveis.

class  BankAccount{
    private String accountNumber;
    private double Balance;
    public String getAccountNumber(){
        return accountNumber;
        
    }
    
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return Balance;
    }
    
    public void setBalance(double Balance){
        this.Balance = Balance;
    }


}   


public class ex2 {
    public static void main(String[] args){
        BankAccount account = new BankAccount();

        account.setAccountNumber("SB-09876");
        account.setBalance(2000.0);

        
        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();

     
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);


    }

}
