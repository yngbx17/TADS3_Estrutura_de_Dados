package Aula6;

public class QuickSortTime {
    public static void main(String[] args) {
        int[] vetor = new int[900000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        long inicio = System.currentTimeMillis();

        ordenarQS(vetor, 0, vetor.length - 1);

            long fim = System.currentTimeMillis();
            System.out.println("Tempo de execução>" + (fim-inicio));
        }

    static void ordenarQS (int[] vetor,int esquerda, int direita ){
        if(esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            ordenarQS(vetor, esquerda, p);
            ordenarQS(vetor, p+1, direita);
        }
    }

    static int particao (int [] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true){
            do {
                i++;
            }while (vetor[i] < pivo);
            do{
                j--;
            } while (vetor[j] > pivo);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }

    }

}