//Fac¸a um programa que preencha um vetor com 10 numeros reais, calcule e mostre a ´
//quantidade de numeros negativos e a soma dos n ´ umeros positivos desse vetor.
import java.util.Scanner;

public class Vetor11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float [] numeros = new float[10];
        int negativos = 0;
        float somaPos = 0;

        int i = 0;
        while(i < numeros.length){
            System.out.println("Digite um numero " + (i + 1) + ": ");
            numeros[i] = in.nextInt();

            if(numeros[i] < 0){
                negativos++;
            }else {
                somaPos = somaPos + numeros[i];
            }
            i++;
        }
        System.out.println("Quant de numeros negativos: " + negativos);
        System.out.println("Soma dos nº positivos: " + somaPos);
    }
}
