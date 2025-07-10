public class Vetor25 {
    public static void main(String[] args) {
        
        int[] vetor = new int[100];
        int numero = 1;
        int i = 0;

        while(i<100){
            if(numero % 7 != 0 && numero % 10 != 7){
                vetor[i] = numero;
                i++;
            }
            numero++;

            System.out.println("vetor c os 100 nº naturais q n sao multiplos de 7 e n terminam em 7: ");
            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[j] + "\t");
                if((j + 1) % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
