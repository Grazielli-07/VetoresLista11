// Crie um programa que le 6 valores inteiros pares e, em seguida, mostre na tela os valores ˆ
//lidos na ordem inversa.
import java.util.Scanner;

public class Vetor9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int[6];
        int i = 0;

        //le os 6 valores pares
        while(i < vetor.length){
            System.out.println("Digite um numero par para a posicao " + i + ": ");
            int valor = in.nextInt();
            if(valor % 2 == 0) {
                vetor[i] = valor;
                i++;
            }else{
                System.out.println("Digite um numero par!!");
            }
        }
        //impressao na ordem inversa
        System.out.println("Valores pares na ordem inversa: ");
        i = vetor.length - 1;
        while(i >= 0 ) {
            System.out.println(vetor[i]);
            i--;
        }
    }
}
