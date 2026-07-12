//DCrie um array de 4 notas (double). 
//Calcule a média delas manualmente (sem usar loops, só acessando os índices [0] a [3]) e imprima o resultado.
public class ex4{
    public static void main(String[] args){
        double[] array = new double[4];
        array[0] = 12;
        array[1] = 15;
        array[2] = 20;
        array[3] = 25;
        double media = (array[0]+array[1]+array[2]+array[3]) / 4;
        System.out.print("A media dos numeros é "+ media);
    }
}