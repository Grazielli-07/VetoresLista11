//Fac¸a um programa que leia um vetor de 8 posic¸oes e, em seguida, leia tamb ˜ em dois va- ´
//lores X e Y quaisquer correspondentes a duas posic¸oes no vetor. Ao final seu programa ˜
//devera escrever a soma dos valores encontrados nas respectivas posic¸ ´ oes ˜ X e Y .
import java.util.Scanner;

public class Vetor4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int [8];

        //le o vetor
        int i = 0;
        while( i < vetor.length){
            System.out.println("Digite o valor da posicao " + i + ": ");
            vetor[i] = in.nextInt();
            i++;

        }

        //le as posicoes x e y
        System.out.println("Digite a posicao X (0 a 7): ");
        int x = in.nextInt();
        System.out.println("Digite a posicao Y (0 a 7): ");
        int y = in.nextInt();

        //verifica se x e y sao ´valido
        if(x >= 0 && x < 8 && y >= 0 && y < 8){
            int soma = vetor[x] + vetor[y];
            System.out.println("Soma dos valores " + x + " e " + y + ": " + soma);

        } else{
            System.out.println("posicoes invalidas");
        }
    }
}
