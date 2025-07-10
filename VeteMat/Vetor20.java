//Escreva um programa que leia numeros inteiros no intervalo [0,50] e os armazene em um ´
//vetor com 10 posic¸oes. Preencha um segundo vetor apenas com os n ˜ umeros ´ ´ımpares
//do primeiro vetor. Imprima os dois vetores, 2 elementos por linha.
import java.util.Scanner;

public class Vetor20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetorImp = new int[10];
        int contImp = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("digite um numero entre 0 e 50 " + "posicao " + i + ": ");
            int valor = in.nextInt();

            while (valor < 0 || valor > 50){
                System.out.println("Valor invalido, digite um numero entre 0 e 50: ");
                valor = in.nextInt();
            }
            vetor1[i] = valor;

            if(valor % 2 != 0){
                vetorImp[contImp] = valor;
                contImp++;
            }
        }
        System.out.println("vetor completo: ");
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(vetor1[i] + "\t" + vetor1[i + 1]);     
        }
        System.out.println("vetor com numeros impares: ");
        for (int i = 0; i < contImp; i = i + 2) {
            if(i + 1 < contImp){
                System.out.println(vetorImp[i] + "\t" + vetorImp[i+1]);
            }else {
                System.out.println(vetorImp[i]);
            }
        }
    }
}
