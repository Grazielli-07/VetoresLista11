//Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos. ˆ
import java.util.Scanner;
public class Vetor2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] valores = new int[6]; //vetor que armazena 6 numeros

        //ler os 6 valores
        int i = 0;
        while(i < valores.length) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            valores[i] = in.nextInt();
            i++;
        }

        //mostrar valores
        System.out.println("Valores digitados: ");
        i = 0;
        while(i < valores.length) {
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
            i++;
        }
    }
}
