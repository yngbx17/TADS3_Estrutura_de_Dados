package Aula5;

public class Aulaestruturade_dados5 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);
        System.out.println("Desempilhar elemento " + pilha.desempilha());
        System.out.println(pilha);


        //System.out.println(pilha.topo());
        //System.out.println(pilha);

        //pilha.empilha(1);
        //pilha.empilha(2);
        //pilha.empilha(3);

        //System.out.println(pilha.topo());
        //System.out.println(pilha);


       // System.out.println(pilha);
       // System.out.println(pilha.estaVazia());//pilha.empilha(1);
       // System.out.println(pilha);
       // System.out.println(pilha.estaVazia());


        //for(int i=1; i<10;i++){
        //pilha.empilha(i);
        //}
        //System.out.println(pilha);
        //System.out.println("Tamanho da pilha: " + pilha.tamanho());
    }
}
