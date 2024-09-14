package Aula6;

public class InsertionSortTime {
    public static void main(String[] args) {
        int[] vetor = new int[9000000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);

        }
        long inicio = System.currentTimeMillis();

        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[1];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução>" + (fim-inicio));
    }
}

