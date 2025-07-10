//Leia dois vetores de inteiros x e y, cada um com 5 elementos (assuma que o usuario n ´ ao ˜
//informa elementos repetidos). Calcule e mostre os vetores resultantes em cada caso
//abaixo:
//• Soma entre x e y: soma de cada elemento de x com o elemento da mesma posic¸ao ˜
//em y.
//• Produto entre x e y: multiplicac¸ao de cada elemento de ˜ x com o elemento da mesma
//posic¸ao em ˜ y.
//• Diferenc¸a entre x e y: todos os elementos de x que nao existam em ˜ y.
//• Intersec¸ao entre ˜ x e y: apenas os elementos que aparecem nos dois vetores.
//• Uniao entre ˜ x e y: todos os elementos de x, e todos os elementos de y que nao ˜
//estao em ˜ x.
import java.util.Scanner;
public class Vetor32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[5];
        int[] y = new int[5];
        int[] soma = new int[5];
        int[] produto = new int[5];

        int[] diferenca = new int[5];   // Máximo de 5 elementos
        int[] intersecao = new int[5];  // Máximo de 5 elementos
        int[] uniao = new int[10];      // Máximo de 10 elementos (5 de x + 5 de y)

        int tamDiferenca = 0;
        int tamIntersecao = 0;
        int tamUniao = 0;

        // Leitura do vetor X
        System.out.println("Digite 5 elementos para o vetor X:");
        for (int i = 0; i < 5; i++) {
            x[i] = scanner.nextInt();
        }

        // Leitura do vetor Y
        System.out.println("Digite 5 elementos para o vetor Y:");
        for (int i = 0; i < 5; i++) {
            y[i] = scanner.nextInt();
        }

        // Soma e Produto
        for (int i = 0; i < 5; i++) {
            soma[i] = x[i] + y[i];
            produto[i] = x[i] * y[i];
        }

        // Diferença: elementos de X que não estão em Y
        for (int i = 0; i < 5; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado && tamDiferenca < diferenca.length) {
                diferenca[tamDiferenca] = x[i];
                tamDiferenca++;
            }
        }

        // Interseção: elementos que aparecem nos dois vetores (sem repetir)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    boolean jaExiste = false;
                    for (int k = 0; k < tamIntersecao; k++) {
                        if (intersecao[k] == x[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste && tamIntersecao < intersecao.length) {
                        intersecao[tamIntersecao] = x[i];
                        tamIntersecao++;
                    }
                    break;
                }
            }
        }

        // União: todos os de X + os de Y que não estão em X
        for (int i = 0; i < 5; i++) {
            uniao[tamUniao] = x[i];
            tamUniao++;
        }

        for (int i = 0; i < 5; i++) {
            boolean existe = false;
            for (int j = 0; j < 5; j++) {
                if (y[i] == x[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe && tamUniao < uniao.length) {
                uniao[tamUniao] = y[i];
                tamUniao++;
            }
        }

        // Exibição dos resultados
        System.out.println("\nSoma dos vetores:");
        for (int i = 0; i < 5; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println("\n\nProduto dos vetores:");
        for (int i = 0; i < 5; i++) {
            System.out.print(produto[i] + " ");
        }
        System.out.println("\n\nDiferença entre X e Y (X - Y):");
        if (tamDiferenca == 0) {
            System.out.println("Nenhum elemento exclusivo em X.");
        } else {
            for (int i = 0; i < tamDiferenca; i++) {
                System.out.print(diferenca[i] + " ");
            }
        }
        System.out.println("\n\nInterseção entre X e Y:");
        if (tamIntersecao == 0) {
            System.out.println("Nenhum elemento em comum.");
        } else {
            for (int i = 0; i < tamIntersecao; i++) {
                System.out.print(intersecao[i] + " ");
            }
        }
         System.out.println("\n\nUnião entre X e Y:");
        for (int i = 0; i < tamUniao; i++) {
            System.out.print(uniao[i] + " ");
        }
    }
}
