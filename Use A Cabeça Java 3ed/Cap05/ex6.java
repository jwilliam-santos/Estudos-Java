//Escreva um programa que possua uma variável int n fixa e calcule o fatorial desse número
//(ex: se n = 5, o resultado deve ser $5 \times 4 \times 3 \times 2 \times 1 = 120$).
public class ex6{
    public static void main(String[] args) {
        int n = 5;
        int x = 1;
        for(int i=1;i<=n;i++){
            System.out.println(x*n);   //mostrar 120
            x *= i;
        }
    }
}
