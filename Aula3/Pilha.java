package Aula3;

public class Pilha<T> extends Estrutura_Estatica<T> {

    public Pilha() {
        super();
    }

    public Pilha (int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento) {
        //dessa forma estamos reutilizando o código da classe pai
        super.adiciona(elemento);
    }
}

