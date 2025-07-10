
import java.util.Scanner;

public class Vetor28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetor1 = new int[10]; //imp
        int[] vetor2 = new int[10]; //par
        int contv1 = 0;
        int contv2 = 0;

        System.out.println("digite os 10 numeros inteiros: ");
        for (int i= 0; i < 10; i++) {
            System.out.print("vetor[" + i + "]: ");
            vetor[i] = in.nextInt();

            if(vetor[i] % 2 != 0){
                vetor1[contv1] = vetor[i];
                contv1++;
            } else{
                vetor2[contv2] = vetor[i];
                contv2++;
            }
        }
        System.out.println("\n valores impares: ");
        for (int i = 0; i < contv1; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println("\n valores pares: ");
        for (int i = 0; i < contv2; i++) {
            System.out.print(vetor2[i] + " ");
        }
    }
}
