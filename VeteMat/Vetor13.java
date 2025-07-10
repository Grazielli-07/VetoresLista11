import java.util.Scanner;
public class Vetor13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] valores = new float[5];
        float maior, menor;
        int posMaior = 0, posMenor = 0;

        int i = 0;
        while(i < valores.length){
            System.out.println("Digite o valor " + (i + 1) + ": ");
            valores[i] = in.nextInt();
            i++;
        }
        maior = valores[0];
        menor = valores[0];

        for (i = 1; i < valores.length; i++) {
            if(valores[i] > maior){
                maior = valores[i];
                posMaior = i;
            }
            if(valores[i] < menor){
                menor = valores[i];
                posMenor = i;
            }
            
        }
        System.out.println("Maior valor: " + maior + "posicao " + posMaior);
        System.out.println("Menor valor: " + menor + "posicao " + posMenor);
        
    }
}
