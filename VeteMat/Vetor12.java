// Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos
//juntamente com o maior, o menor e a media dos valores.
import java.util.Scanner;
public class Vetor12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] valores = new float[5];
        float soma = 0;
        float maior, menor;

        int i = 0;
        while(i < valores.length){
            System.out.println("Digite o valor " + (i + 1) + ": ");
            valores[i] = in.nextInt();
            soma = soma + valores[i];
            i++;
        }
        maior = valores[0];
        menor = valores[0];

        i = 1;
        while(i < valores.length){
            if(valores[i] > maior){
                maior = valores[i];
            }
            if(valores[i] < menor){
                menor = valores[i];
            }
            i++;
        }
        System.out.println("Valores digitados: ");
        i = 0;
        while(i < valores.length){
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
            i++;
        }
        float media = soma / valores.length;
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.printf("Media dos valores: " + media);
    }
}
