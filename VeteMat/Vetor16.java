// Fac¸a um programa que leia um vetor de 5 posic¸oes para n ˜ umeros reais e, depois, um ´
//codigo inteiro. Se o c ´ odigo for zero, finalize o programa; se for 1, mostre o vetor na ordem ´
//direta; se for 2, mostre o vetor na ordem inversa. Caso, o codigo for diferente de 1 e 2 ´
//escreva uma mensagem informando que o codigo ´ e inv ´ alido
import java.util.Scanner;

public class Vetor16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float [] vetor = new  float[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero " + i + ": ");
            vetor[i] = in.nextInt();
        }
        System.out.println("Digite um codigo (0=fim, 1=direta, 2=inversa)");
        int cod = in.nextInt();
        System.out.println();

        if(cod == 0) {
            System.out.println("programa finalizado");
        }else if(cod == 1){
            System.out.println("vetor ordem direta");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("posicao " + i + ": " + vetor[i]);
            }
        }else if(cod == 2){
            System.out.println("vetor  ordem inversa");
            for (int i = vetor.length - 1; i >= 0; i--) {
                System.out.println("posicao " + i + ": " + vetor[i]);
                
            }
        }else {
            System.out.println("codigo invalido");
        }
    }
}
