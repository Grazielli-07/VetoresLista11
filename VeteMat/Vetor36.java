
import java.util.Scanner;

public class Vetor36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("digite 10 numeros: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vetor[i] = in.nextInt();
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if(vetor[j] > vetor[i] + 1){
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
