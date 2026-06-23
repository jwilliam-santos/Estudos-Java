
//Crie uma classe Livro com os atributos titulo e paginas. 
//No main, crie um array de 3 Livros. 
//Instancie cada um, atribua valores e use um loop para imprimir o título de todos.
class Livro{
    String titulo;
    int pag;
}
public class ex1 {
    public static void main(String[] args){
        Livro[] estante = new Livro[3];
        estante[0] = new Livro(); 
        estante[0].titulo = "Java Guia Prático";
        estante[0].pag = 200; 
        estante[1] = new Livro();
        estante[1].titulo  = "Python Guia Prático";
        estante[1].pag = 552;
        estante[2] = new Livro();
        estante[2].titulo = "C# Guia Prático";
        estante[2].pag = 672;
        int i = 0;
        while(i < 3){
            System.out.println("Nome do livro:"+ estante[i].titulo + " N°Pags:" + estante[i].pag);
            i++;
        }
        

    }


}