import java.util.Scanner;
public class Vetor35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        // Ler os dois números
        do {
            System.out.print("Digite o número A (positivo < 10000): ");
            a = scanner.nextInt();
        } while (a <= 0 || a >= 10000);

        do {
            System.out.print("Digite o número B (positivo < 10000): ");
            b = scanner.nextInt();
        } while (b <= 0 || b >= 10000);

        // Vetores com até 5 posições (9999 + 9999 = 19998 tem até 5 dígitos)
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        // Preencher os vetores com os algarismos (menos significativo primeiro)
        int i = 0;
        int temp = a;
        while (temp > 0) {
            vetorA[i] = temp % 10;
            temp /= 10;
            i++;
        }

        i = 0;
        temp = b;
        while (temp > 0) {
            vetorB[i] = temp % 10;
            temp /= 10;
            i++;
        }

        // Soma dos vetores com vai-um
        int[] soma = new int[6]; // pode ter até 5+1 dígitos no pior caso
        int vaiUm = 0;

        for (i = 0; i < soma.length; i++) {
            int digitoA = (i < vetorA.length) ? vetorA[i] : 0;
            int digitoB = (i < vetorB.length) ? vetorB[i] : 0;

            int total = digitoA + digitoB + vaiUm;

            if (total >= 10) {
                soma[i] = total - 10;
                vaiUm = 1;
            } else {
                soma[i] = total;
                vaiUm = 0;
            }
        }

        // Remover zeros à esquerda do resultado (do fim pro início)
        int ultimoIndice = soma.length - 1;
        while (ultimoIndice > 0 && soma[ultimoIndice] == 0) {
            ultimoIndice--;
        }

        // Mostrar os vetores e o resultado
        System.out.print("\nNúmero A em vetor (menos significativo primeiro): ");
        for (i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nNúmero B em vetor (menos significativo primeiro): ");
        for (i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.print("\n\nSoma A + B em vetor: ");
        for (i = 0; i <= ultimoIndice; i++) {
            System.out.print(soma[i] + " ");
        }

        // Também mostrar o número normal (mais significativo primeiro)
        System.out.print("\nSoma final: ");
        for (i = ultimoIndice; i >= 0; i--) {
            System.out.print(soma[i]);
        }

        System.out.println();
        scanner.close();
    }
}
