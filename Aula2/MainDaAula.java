package Aula2;

public class MainDaAula {
    public static void main(String[] args) throws Exception {
        Vetor v1 = new Vetor(5);

        v1.adiciona("Elemento 0");
        v1.adiciona("Elemento 1");
        v1.adiciona("Elemento 2");
        v1.adiciona("Elemento 3");
        v1.adiciona("Elemento 4");
        v1.adiciona("Elemento 5");
        v1.adiciona("Elemento 6");
        v1.adiciona("Elemento 7");

        System.out.println("A quantidade de informações no vetor é: " + v1.tamanho());
        System.out.println("Dados do vetor " + v1.toString());

        v1.remove(3);

        System.out.println("A quantidade de informações no vetor é: " + v1.tamanho());
        System.out.println("Dados do vetor " + v1.toString());

        v1.removeComparacao(String.valueOf(2));

        System.out.println("A quantidade de informações no vetor é: " + v1.tamanho());
        System.out.println("Dados do vetor " + v1.toString());

        //try {
        // v1.adiciona("elemento 1");
        // v1.adiciona("elemento 2");
        // }catch (Exception e){
        // e.printStackTrace();
        // }
        //System.out.println("A quantidade de info no vetor: " + v1.tamanho);
        //System.out.println("Dados do vetor: " + v1.toString());
        //System.out.println("Busca do vetor: " + v1.busca(1));
        //System.out.println("Busca por comparação do vetor: " + v1.busca1("elemento 1"));
        //v1.adicionaInicio(0, "Elemento 0");
        //System.out.println("A quantidade de informacoes no vetor e: " + v1.tamanho());
        //System.out.println("Dados do Vetor: " + v1.toString());
        //System.out.println("Informacao na posicao 1:  " + v1.busca(1));
    }
}