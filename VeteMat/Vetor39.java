// Escreva um programa que leia um numero inteiro positivo ´ n e em seguida imprima n
//linhas do chamado Triangulo de Pascal:
import java.util.Scanner;

public class Vetor39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("digite o numero de linhas");
        int n = in.nextInt();

        int[][] pascal = new int[n][n];

        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int e = 0; e < n - 1; e++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
        
            }
            System.out.println();
        }
    }
}
