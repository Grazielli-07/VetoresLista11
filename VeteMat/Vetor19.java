//Fac¸a um vetor de tamanho 50 preenchido com o seguinte valor: (i + 5 ∗ i)%(i + 1), sendo
//i a posic¸ao do elemento no vetor. Em seguida imprima o vetor na tela.
public class Vetor19 {
    public static void main(String[] args) {
        
        int [] vetor = new int [50];

        //preenche o vetor c a formula (i + 5*i) % (i+1)
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (i + 5 * i) % (i + 1); 
        }

        System.out.println("Vetor preenchido: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posicao " + i + ": " + vetor[i]);
        }
    }
}
