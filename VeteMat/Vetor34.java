
import java.util.Scanner;

public class Vetor34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];
        int numero;
        int i = 0;

        System.out.println("digite 10 numeros diferentes: ");

        while( i < 10){
            System.out.print("Numero " + (i + 1) + ": ");
            numero = in.nextInt();
            boolean repetido = false;
            int j = 0;
            while(j < i) {
                if(vetor[j] == numero) {
                    repetido = true;
                    break;
                }
                j++;
            }
            if(repetido){
                System.out.println("Numero repetido,  digite outro");
            }else{
                vetor[i] = numero;
                i++;
            }
        }
        System.out.println("vetor final: ");
        int k = 0;
        while(k < 10) {
            System.out.print(vetor[k] + " ");
            k++;
        }
    }
}
