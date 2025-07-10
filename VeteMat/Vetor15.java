import java.util.Scanner;

public class Vetor15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = new int[20];
        int [] unicos = new int[20];
        int contadorUnicos = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            vetor[i] = in.nextInt();    
        }
        for (int i = 0; i < vetor.length; i++) {
            int repetido = 0;

            for (int j = 0; j < contadorUnicos; j++) {
                if(vetor[i] == unicos[j]){
                    repetido++;
                }
            }

            if(repetido == 0 ){
                unicos[contadorUnicos] = vetor[i];
                contadorUnicos++;
            }
            
        }

        System.out.println("vetor sem valor repetido:");
        for (int i = 0; i < contadorUnicos; i++) {
            System.out.print(unicos[i] + " ");
            
        }
    }
}
