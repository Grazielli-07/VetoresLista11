//Leia 10 numeros inteiros e armazene em um vetor. Em seguida escreva os elementos ´
//que sao primos e suas respectivas posic¸ ˜ oes no vetor.
import java.util.Scanner;
public class Vetor27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        // Leitura dos números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("vetor[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        // Verificação de primos
        System.out.println("\nNúmeros primos e suas posições:");
        for (int i = 0; i < 10; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.println("vetor[" + i + "] = " + vetor[i]);
            }
        }
    }

    // Função que verifica se um número é primo
    public static boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
