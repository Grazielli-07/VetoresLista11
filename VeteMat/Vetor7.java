// Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima ´
//o vetor, o maior elemento e a posic¸ao que ele se encontra.
import java.util.Scanner;

public class Vetor7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];

        //le os 10 n inteiros
        int i = 0;
        while(i < vetor.length){
            System.out.println("Difgite o valor da posicao " + i + ": ");
            vetor[i] = in.nextInt();
            i++;
        }

        //inicia c o primeiro valor
        int maior = vetor[0];
        int posMaior = 0;

        //busca pelo maior valor e a sua posicao
        i = 1;
        while(i < vetor.length) {
            if(vetor[i] > maior){
                maior = vetor[i];
                posMaior = i;

            }
            i++;
        }
        //msotra o vetor
        System.out.println("Valores do vetor");
        i = 0;
        while(i < vetor.length){
            System.out.println("Posicao " + i + ": " + vetor[i]);
            i++;
        }
        //imprime o valor e a sua ppsocap
        System.out.println("Maior valor: " + maior);
        System.out.println("Posicao do maior valor: " + posMaior );
    }
}
