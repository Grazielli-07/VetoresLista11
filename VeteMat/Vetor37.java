public class Vetor37 {
    public static void main(String[] args) {
        
        int[] A = {1, 3, 5, 7, 9, 12, 10, 8, 6, 4, 2};

        int[] ordenado = new int[11];

        for (int i = 0; i <= 5; i++) {
            ordenado[i] = A[i];
        }

        int ultimos = 6;
        for (int i = 10; i >= 6; i--) {
            ordenado[ultimos] = A[i];
            ultimos++;
        }
        System.out.println("vetor ordenado: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(ordenado[i] + " ");
        }
    }
}
