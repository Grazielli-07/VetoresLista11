//Fac¸a um programa que receba do usuario dois vetores, ´ A e B, com 10 numeros inteiros ´
//cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na tela os dados
//do vetor C
import java.util.Scanner;

public class Vetor21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.println("digite os 10 valores do vetor A: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("A[" + i + "]: ");
            vetorA[i] = in.nextInt();
        }

        System.out.println("digite os 10 valores do vetor B: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "]: ");
            vetorB[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        System.out.println("vetor C (A - B): ");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + vetorC[i]);
        }
    }
}
