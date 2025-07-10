//Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
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
