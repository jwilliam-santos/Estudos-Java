/*Eis uma prévia do que veremos mais adiante. Neste capítulo, você aprendeu sobre
inteiros e o tipo int. O Java também pode representar números de pontos flutuantes que contêm pontos de fração decimal, como 3,14159.
Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
circunferência e área utilizando o valor do ponto flutuante 3,14159 para S. Utilize as técnicas mostradas na Figura 2.7. [Observação: você
também pode empregar a constante Math.PI predefinida para o valor de S. Essa constante é mais precisa que o valor 3,14159. A classeMath é definida no pacote java.lang. As classes nesse pacote são importadas automaticamente, portanto, você não precisa importara classe Math para utilizá-la.] */
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double b = Math.PI;
        System.out.println("Digite o número do raio para calcular area e comprimento da circunferencia");
        double raio = a.nextDouble();
        double Area = b *raio * raio;
        double Comprimento = 2*(b*raio);
        System.out.println("a Area é "+ Area + " e o Comprimento é "+ Comprimento);
        
    }
}
