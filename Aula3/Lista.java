package Aula3;
//herdar os atributos e os metodos as classes Listas e Pilhas
public class Lista<T> extends Estrutura_Estatica<T> {

    public Lista(int capacidade) {
        super(capacidade);
    }

    //metodo construtor sem parametros
    public Lista() {
        super();
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }
}

