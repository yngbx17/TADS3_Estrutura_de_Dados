package exemplosrevisao;

import java.util.Random;

public class Exemplo1 {

    private static final int max=20;

    public static void main(String[] args) {
        int[] v=new int[10];
        inserir(v);
        mostrar(v);
    }
    public static void inserir(int [] v) {
        Random rd = new Random();
        int vInicial = 1;
        int vFinal = 10;

        for (int i = 0; i < v.length; i++) {
            v[i] = vInicial + rd.nextInt((vFinal - vInicial));

        }
    }
        public static void mostrar(int[] v){
            for(int n:v)
                System.out.println(n);
        }
    }


