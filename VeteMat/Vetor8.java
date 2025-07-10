// Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos ˆ
//na ordem inversa.
import java.util.Scanner;

public class Vetor8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int[6];

        //le os 6 valores
        int i = 0;
        while(i < vetor.length){
            System.out.println("Digite o valor " + (i + 1) + ": ");
            vetor[i] = in.nextInt();
            i++;
        }

        //impre valor na ordem inversa
        System.out.println("Valores na ordem inversa");
        i = vetor.length - 1;
        while(i >= 0 ){
            System.out.println(vetor[i]);
            i--;
        }
    }
}
