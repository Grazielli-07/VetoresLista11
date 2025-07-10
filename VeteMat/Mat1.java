//Fac¸a um programa que possua um vetor denominado A que armazene 6 numeros intei- ´
//ros. O programa deve executar os seguintes passos:
//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
//(b) Armazene em uma variavel inteira (simples) a soma entre os valores das posic¸ ´ oes ˜
//A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
//(c) Modifique o vetor na posic¸ao 4, atribuindo a esta posic¸ ˜ ao o valor 100. ˜
//(d) Mostre na tela cada valor do vetor A, um em cada linha.
import java.util.Scanner;

public class Mat1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][]  matriz = new int[4][4];
        int contador = 0;

        System.out.println("digite os valores das matrizes 4x4: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();

                if(matriz[i][j] > 10){
                    contador++;
                }
            }
        }

        System.out.println("quantidade de valores maiores que 10: " + contador);
    }
}
