/*Escreva um tipo enum TrafficLight, cuja constante (RED, GREEN, YELLOW) aceite um parâmetro — a duração da luz. Escreva um
programa para testar o enum TrafficLight de modo que ele exiba a constante enum e suas durações. */
enum TrafficLight{
    GREEN(5),
    RED(5),
    Yellow(5);
    private int duração;
    TrafficLight(int duração){
        this.duração = duração;
    }
    public int GetD(){return duração;}
}
public class ex1{
    public static void main(String[] args) {
        TrafficLight a = TrafficLight.RED;
        System.out.println(a.GetD());

    }
}
