
import java.util.Scanner;

public class Vetor17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posicao " + i + ": ");
            vetor[i] = in.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0){
                vetor[i] = 0;
            }
        }

        System.out.println("vetor com negativos substituido por zero: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}
