//Crie uma classe Produto com nome e preco.
//Crie um array de 3 produtos. 
//Atribua valores e, depois, faça um laço que imprime o nome de todos os produtos que custam mais que 50.0.
class Produto{
    String  nome;
    double preço;
}
public class ex5{
    public static void main(String[] args){
            Produto[] estoque = new Produto[3];
            estoque[0] = new Produto();
            estoque[0].nome = "Memoria Ram";
            estoque[0].preço = 400;
            estoque[1] = new Produto();
            estoque[1].nome = "CPU";
            estoque[1].preço = 49;
            estoque[2] = new Produto();
            estoque[2].nome = "Placa mãe";
            estoque[2].preço = 400.99;
            int i = 0;
            while (i< 3){
                if (estoque[i].preço > 50){
                    System.out.println("O preço do produto "+ estoque[i].nome +" e maior que 50");
                };
                i++;
            };

            System.out.println("Fim do programa");
    }
}