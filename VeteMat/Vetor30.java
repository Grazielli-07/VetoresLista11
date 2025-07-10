//Fac¸a um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a
//intersecc¸ao entre os 2 vetores anteriores, ou seja, que cont ˜ em apenas os n ´ umeros que ´
//estao em ambos os vetores. N ˜ ao deve conter n ˜ umeros repetidos.
import java.util.Scanner;

public class Vetor30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorIn = new int[10];
        int tamIn = 0;

        System.out.println("Digite os 10 elementos do vetor1: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = in.nextInt();
        }
         System.out.println("Digite os 10 elementos do vetor2: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(vetor1[i] == vetor2[j]){
                    boolean jaExiste = false;
                    for (int k = 0; k < tamIn; k++) {
                        if(vetorIn[k] == vetor1[i]){
                            jaExiste = true;
                            break;
                        }
                    }
                    if(!jaExiste){
                        vetorIn[tamIn] = vetor1[i];
                        tamIn++;
                    }
                }
            }
        }

        System.out.println("elemento em comum: ");
        if(tamIn == 0) {
            System.out.println("nenhum numero em comum");
        } else {
            for (int i = 0; i < tamIn; i++) {
                System.out.print(vetorIn[i] + " ");
                
            }
        }
    }
}
