
import java.util.Scanner;

public class Vetor38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int quant = 0;

        while(quant < 10){
            System.out.println("Digite o " + (quant + 1) + "º numero: ");
            int novoNum = in.nextInt();

            int pos = quant;
            while(pos > 0 && vetor[pos - 1] > novoNum){
                vetor[pos] = vetor[pos - 1];
                pos--;
            }

           
            vetor[pos] = novoNum;
            quant++;

            System.out.println("vetor ate agr: ");
        for (int i = 0; i < quant; i++) {
            System.out.println(vetor[i] + " ");
        }
        
        }
        System.out.println();
    }
}
