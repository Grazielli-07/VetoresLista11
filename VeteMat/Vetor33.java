//Fac¸a um programa que leia um vetor de 15 posic¸oes e o compacte, ou seja, elimine as ˜
//posic¸oes com valor zero. Para isso, todos os elementos ˜ a frente do valor zero, devem ser `
//movidos uma posic¸ao para tr ˜ as no vetor.
import java.util.Scanner;

public class Vetor33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[15];
        int tamanho = 15;

        System.out.println("digite 15 numeros inteiros: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }

        int i = 0;
        while(i < tamanho) {
            if(vetor[i] == 0 ) {
                for (int j = i; j < tamanho - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                tamanho--;
            }else {
                i++;
            }
        }
        System.out.println("vetor compactado: ");
        for (i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
