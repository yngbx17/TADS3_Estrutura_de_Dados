package Aula5;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila.toString());
        System.out.println(fila.peek());
        System.out.println(fila.remove());
    }
}
