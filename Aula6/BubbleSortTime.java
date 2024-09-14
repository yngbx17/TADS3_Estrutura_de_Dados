package Aula6;

public class BubbleSortTime {
    public static void main(String[] args) {
        int [] vetor = new int [10000];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);

        }
         long inicio = System.currentTimeMillis();

         int aux;
         for (int i = 0; i < vetor.length; i++){
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução>" + (fim-inicio));
    }
}
