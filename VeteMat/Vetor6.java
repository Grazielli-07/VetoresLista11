//Fac¸a um programa que receba do usuario um vetor com 10 posic¸ ´ oes. Em seguida dever ˜ a´
//ser impresso o maior e o menor elemento do vetor.
import java.util.Scanner;

public class Vetor6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int [10];

        //le os vakores do vetor
        int i = 0;
        while( i < vetor.length) {
            System.out.println("Digite o valor da posivao " + i);
            vetor[i] = in.nextInt();
            i++;
        }
        //inicia maior e menor com o primeiro elemento
        int maior = vetor[0];
        int menor = vetor[0];
        int posMaior = 0;
        int posMenor = 0;

        //percoree o vetorp encontrar maior emnor
        i = 1;
        while(i < vetor.length){
            if(vetor[i] > maior){
                maior = vetor[i];
                posMaior = i;
            }
            if(vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
            i++;
        }

        System.out.println("Maior valor " + maior + " posicao " + posMaior);
        System.out.println("Menor valor " + menor + " posicao " + posMenor);
    }
}
