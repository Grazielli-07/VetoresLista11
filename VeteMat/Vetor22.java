// Fac¸a um programa que leia dois vetores de 10 posic¸oes e calcule outro vetor contendo, ˜
//nas posic¸oes pares os valores do primeiro e nas posic¸ ˜ oes impares os valores do se- ˜
//gundo.
import java.util.Scanner;

public class Vetor22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.println("digite os 10 valores do vetor A:");
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
            if(i % 2 == 0) {
                vetorC[i] = vetorA[i];
            }else {
                vetorC[i] = vetorB[i];
            }
        }

        System.out.println("vetor C (pares de A, impares de B)");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + vetorC[i]);
        }
    }
}
