//Fac¸a um programa para ler 10 numeros DIFERENTES a serem armazenados em um ´
//vetor. Os dados deverao ser armazenados no vetor na ordem que forem sendo lidos, ˜
//sendo que caso o usuario digite um n ´ umero que j ´ a foi digitado anteriormente, o programa ´
//devera pedir para ele digitar outro n ´ umero. Note que cada valor digitado pelo usu ´ ario ´
//deve ser pesquisado no vetor, verificando se ele existe entre os numeros que j ´ a foram ´
//fornecidos. Exibir na tela o vetor final que foi digitado.
import java.util.Scanner;

public class Vetor34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];
        int numero;
        int i = 0;

        System.out.println("digite 10 numeros diferentes: ");

        while( i < 10){
            System.out.print("Numero " + (i + 1) + ": ");
            numero = in.nextInt();
            boolean repetido = false;
            int j = 0;
            while(j < i) {
                if(vetor[j] == numero) {
                    repetido = true;
                    break;
                }
                j++;
            }
            if(repetido){
                System.out.println("Numero repetido,  digite outro");
            }else{
                vetor[i] = numero;
                i++;
            }
        }
        System.out.println("vetor final: ");
        int k = 0;
        while(k < 10) {
            System.out.print(vetor[k] + " ");
            k++;
        }
    }
}
