//. Fac¸a um programa que possua um vetor denominado A que armazene 6 numeros intei- ´
//ros. O programa deve executar os seguintes passos:
//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
//(b) Armazene em uma variavel inteira (simples) a soma entre os valores das posic¸ ´ oes ˜
//A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
//(c) Modifique o vetor na posic¸ao 4, atribuindo a esta posic¸ ˜ ao o valor 100. ˜
//(d) Mostre na tela cada valor do vetor A, um em cada linha.
public class Vetor1{
    public static void main(String[] args) {
        //criacao do vetor A
        int [] A = {1, 0, 5, -2, -5, 7};
        //soma do valores em posicao 0, 1 e 5
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma dos valores em posição 0, 1 e 5: " + soma);
        //modificacao do valor da posicao 4 p 100
        A[4] = 100;
        //mostrar cada valor do vetor A, um em cada linha;
        int i = 0;
        while(i < A.length) { 
            System.out.println("A[" + i + "] = " + A[i]);
            i++;
    
        }

    }
}
