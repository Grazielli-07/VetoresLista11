import java.util.Scanner;

public class Vetor18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero da posicao " + i + ": ");
            vetor[i] = in.nextInt();
        }


        System.out.println("Digite um numero x p verificar multiplos");
        int x = in.nextInt();


        int contador = 0;
        System.out.println("multiplo de " + x + ": ");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % x == 0){
                System.out.println("posicao " + i + ": " + vetor[i]);
                contador++;
            }
        }

        if(contador == 0){
            System.out.println("nenhum valor no vetor eh multi´plo ");
        }else {
            System.out.println("quantidade de multiplos de " + x + ": " + contador);
        }
    }
}
