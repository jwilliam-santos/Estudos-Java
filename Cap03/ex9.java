//Crie uma classe Conta com o atributo saldo. 
//No main, crie um array de 2 Contas. 
//Atribua saldo 100 para a primeira e saldo 200 para a segunda.
//Crie uma variável Conta c = conta[0]. Mude o saldo de c para 500. 
//Imprima conta[0].saldo para ver o efeito.
class Conta{
    double saldo;
}
public class ex9{
    public static void main(String[]args){
        Conta[] contas = new Conta[2];
        contas[0] = new Conta();
        contas[1] = new Conta();
        contas[0].saldo = 100;
        contas[1].saldo = 200;
        Conta c = new Conta();
        c = contas[0];
        c.saldo = 500;
        System.out.print(contas[0].saldo);

    }
}