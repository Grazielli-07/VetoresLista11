
import java.util.Scanner;

public class Vetor14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);


        int [] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posicao " + i + ": ");
            vetor[i] = in.nextInt();
        }
        int contadorRep = 0;

        System.out.println("valores repetifos");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] == vetor[j]){
                    System.out.println("Valor " + vetor[i] + " se repete nas posicoes " + i + " e " + j);
                    contadorRep++;
                }
            }
        }
        if(contadorRep == 0){
            System.out.println("Nao tem valor repetido");
        }
    }
}
