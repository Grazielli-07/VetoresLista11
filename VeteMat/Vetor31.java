import java.util.Scanner;
public class Vetor31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] uniao = new int[20];
        int tamUni = 0;

        System.out.println("digite os 10 elementos do vetor1: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = in.nextInt();
        }
         System.out.println("digite os 10 elementos do vetor2: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = in.nextInt();
        }

        for(int i = 0; i < 10; i++){
            boolean existe = false;
            for(int j = 0; j < tamUni; j++){
                if(uniao[j] == vetor1[i]){
                    existe = true;
                    break;
                }
            }
            if(!existe){
                uniao[tamUni] = vetor1[i];
                tamUni++;
            }
        }
        for(int i = 0; i < 10; i++){
            boolean existe = false;
            for (int j = 0; j < tamUni; j++) {
                if(uniao[j] == vetor2[i]){
                    existe = true;
                    break;
                }
            }
            if(!existe){
                uniao[tamUni] = vetor2[i];
                tamUni++;
            }
        }

        System.out.println("vetor uniao: ");
        for (int i = 0; i < tamUni; i++) {
            System.out.print(uniao[i] + " ");
        }
    }
}
