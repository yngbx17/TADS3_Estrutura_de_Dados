package Aula5;

public class Fila  <T> extends EstruturaEstatica<T> {
    public Fila() {
        super();
    }
    public void enfileira(T elemento) {
        //this.aumentaCapacidade();
        //this.elementos[this.tamanho] = elemento;
        //this.tamanho++

        //vamos aproveitar o código que já existe
        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }
    public T desenfileira() {
        if (this.estaVazia()) {
            return null;
        }
      final int POS = 0;

        T elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elementoASerRemovido;
    }
}
