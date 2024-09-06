package Aula2;
import java.util.Arrays;

public class VetorObjeto {
    public Object[] elementos;
    public int tamanho;

    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elementos) throws Exception {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elementos;
        this.tamanho++;

    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");

        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

    public Object busca(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return elementos[posicao];
        } else {
            throw new Exception("Posição invalida");
        }
    }

    public int busca1(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adicionaInicio(int posicao, Object elemento) throws Exception {
        this.aumentaCapacidade();
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = this.tamanho - 1; i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Posição Inválida");
        }
        return true;
    }

    private void aumentaCapacidade() throws Exception {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];

            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.elementos[tamanho] = null;
            this.tamanho--;
        } else {
            throw new Exception("Posição invalida");
        }
    }

    public void removeComparacao(Object elementos) {
        for (int i = 0; i < this.tamanho - 1; i++) {
            if (this.elementos[i].equals(elementos)) {
                this.elementos[i] = this.elementos[i + 1];
            }
        }
        this.elementos[tamanho] = null;
        this.tamanho--;
    }

}

