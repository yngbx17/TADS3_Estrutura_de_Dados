package Aula1;
import java.util.Scanner;
public class Vetor {
    public String[] elementos;
    public int tamanho;
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    public void adiciona(String elementos) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elementos;
            this.tamanho++;
        } else {
            throw new Exception("O vetor já está cheio" + "não é possível adicionar novos elementos");
        }
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

    public String busca(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return elementos[posicao];
        } else {

            throw new Exception("Posição invalida");
        }
    }

    public int busca1 (String elemento){
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }
}


