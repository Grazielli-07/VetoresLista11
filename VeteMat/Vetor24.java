
import java.util.Scanner;

public class Vetor24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numero = new int[10];
        float[] altura = new float[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("digite o numero do aluno " + (i + 1) + ": ");
            numero[i]= in.nextInt();

            System.out.println("digite a altura do aluno: ");
            altura[i] = in.nextFloat();
        }

        int maisAlto = 0;
        int maisBaixo = 0;

        for (int i = 0; i < 10; i++) {
            if(altura[i] > altura[maisAlto]){
            maisAlto = i;
            }
            if(altura[i] < altura[maisBaixo]){
                maisBaixo = i;
            }
        }

        System.out.println("\nAluno mais alto: ");
        System.out.println("numero: " + numero[maisAlto] + "| altura: "+ altura[maisAlto] + "m");

        System.out.println("\nAluno mais baixo: ");
        System.out.println("numero: " + numero[maisBaixo] + "| altura: " + altura[maisBaixo] + "m");
    }
}
