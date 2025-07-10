//Fac¸a um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule
//e imprima a media geral
import java.util.Scanner;
public class Vetor10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float [] notas = new float[15];
        float soma = 0;

        int i = 0;
        while(i < notas.length){
            System.out.println("Digite  a nota do aluno " + (i + 1) + ": ");
            notas[i] = in.nextInt();
            soma = soma + notas[i];
            i++;
        }
        float media = soma / notas.length;

        System.out.println("Media geral: " + media);


    }
}
