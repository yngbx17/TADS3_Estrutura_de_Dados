package Aula5;

public class TesteBala {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileira(15);
        fila.enfileira(2);
        fila.enfileira(10);
        fila.enfileira(18);
        fila.enfileira(21);
        fila.enfileira(40);
        fila.enfileira(65);
        fila.enfileira(78);
        fila.enfileira(98);
        fila.enfileira(125);
        fila.enfileira(325);
        fila.enfileira(450);
        fila.enfileira(500);


        System.out.println("\nA fila está vazia? " + fila.estaVazia());
        System.out.println("Qual o tamanho da fila: " + fila.tamanho());
        System.out.println(fila.toString());

        System.out.println(fila.espiar());

        if(fila.espiar() == null){
            System.out.println("Ninguem na fila");
        } else {
            System.out.println("O elemento da primeira posição é " + fila.espiar() );
        }

        System.out.println("\n" + fila.toString());
        System.out.println(fila.desenfileira());
        System.out.println(fila.toString());
    }
}