//Crie um array de boolean com tamanho 5. 
//Defina posições alternadas como true e false. 
//Imprima apenas as posições que forem true.
public class ex9{
    public static void main(String[]args){
        boolean[] array = new boolean[6];
        array[0] = true;
        array[1] = false;
        array[2] = true;
        array[3] = false;
        array[4] = true;
        array[5] = false;
        int i = 0;
        while(i< 5){
            if (array[i] == true){
                System.out.println(array[i]);
            };
            i++;

        };
    }
}