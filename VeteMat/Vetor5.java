//Leia um vetor de 10 posic¸oes. Contar e escrever quantos valores pares ele possui
import java.util.Scanner;

public class Vetor5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int[10];
        int pares = 0;

        //le o vetor
        int i = 0;
        while(i < vetor.length){
            System.out.println("Digite o valor da posicao " + i );
            vetor[i] = in.nextInt();

            if(vetor[i] % 2 == 0){
                pares++;
            }

            i++;

            
        }
        //mostrar quanridade de valoeres pares
            System.out.println("Quantidade de valores pares: " + pares);
    }
}
