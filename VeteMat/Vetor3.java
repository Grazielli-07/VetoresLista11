//Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das ´
//componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem ˆ
//10 elementos cada. Imprimir todos os conjuntos.
import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] numeros = new int [10]; //vetor original
        int [] quadrados = new int [10]; //vetor c quadrado

        //le os 10 numros inteiros
        int i = 0;
        while(i < numeros.length) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numeros[i] = in.nextInt();
            quadrados[i] = numeros[i] * numeros[i]; //calcula o quadrado
            i++;
        }

        //mostra os vetores
        System.out.println("Numeros e seus quadrados: ");
        i = 0;
        while(i < numeros.length){
            System.out.println("Numero: " + numeros[i] + " Quadrado: " + quadrados[i]);
            i++;
        }

    }
}
