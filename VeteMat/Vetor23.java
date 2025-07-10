//Ler dois conjuntos de numeros reais, armazenando-os em vetores e calcular o produto ´
//escalar entre eles. Os conjuntos tem 5 elementos cada. Imprimir os dois conjuntos e o ˆ
//produto escalar, sendo que o produto escalar e dado por: ´ x1 ∗ y1 + x2 ∗ y2 + ::: + xn ∗ yn.
import java.util.Scanner;

public class Vetor23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] x = new float[5];
        float[] y = new float[5];
        float prodEsc = 0;

        System.out.println("digite os 5 numeros p vetor x");
        for (int i = 0; i < x.length; i++) {
            System.out.println("X[" + i + "]: ");
            x[i] = in.nextFloat();
        }

        System.out.println("digite 5 numeros p vetor y");
        for (int i = 0; i < y.length; i++) {
            System.out.println("Y[" + i + "]: ");
            y[i] = in.nextFloat();
        }

        for (int i = 0; i < 5; i++) {
            prodEsc = prodEsc + x[i] * y[i];
        }
        System.out.println("\nventor x: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i] + " ");
            
        }
        System.out.println("\n\nvetor y: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i] + " ");
        }
        System.out.println("\n\nproduto escalar: " + prodEsc);
    }
}
