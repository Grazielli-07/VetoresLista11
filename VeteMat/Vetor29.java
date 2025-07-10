//Fac¸a um programa que receba 6 numeros inteiros e mostre: ´
//• Os numeros pares digitados; ´
//• A soma dos numeros pares digitados; ´
//• Os numeros ´ ´ımpares digitados;
//• A quantidade de numeros ´ ´ımpares digitados;
import java.util.Scanner;

public class Vetor29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       int[] numeros = new int[6];
       int[] pares = new int[6];
       int[] impares = new int [6];

       int somaPares = 0;
       int qtdImp = 0;
       int qtdPar = 0;

       int i = 0;
       while(i < 6) {
        System.out.println("digite o numero " + (i + 1) + ": ");
        numeros[i] = in.nextInt();

        if(numeros[i] % 2 == 0 ){
            pares[qtdPar] = numeros[i];
            somaPares = somaPares + numeros[i];
            qtdPar++;
        }else {
            impares[qtdImp] = numeros[i];
            qtdImp++;
        }
        i++;
       }

       System.out.println("\nnumeros pares digitados: ");
       for (i = 0; i < qtdPar; i++) {
        System.out.print(pares[i] + " ");
       }
       System.out.println("\nsoma dos numeros pares: " + somaPares);

       System.out.println("Numeros impares digitados: ");
       for (i = 0; i < qtdImp; i++) {
            System.out.print(impares[i] + " ");
        
       }
       System.out.println("\nquantidade dos numeros impares: " + qtdImp);
    }
}
