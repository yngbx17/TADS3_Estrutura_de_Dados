package Aula1;

public class Main {
    public static void main(String[] args) throws Exception {
        Vetor v1 = new Vetor(5);
        try {
            v1.adiciona("elemento 1");
            v1.adiciona("elemento 2");
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("A quantidade de info no vetor: " + v1.tamanho);
        System.out.println("Dados do vetor: " + v1.toString());
        System.out.println("Busca do vetor: " + v1.busca(1));
        System.out.println("Busca por comparação do vetor: " + v1.busca1("elemento 1"));

    }
}
