package Aula2;
import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Elemento 1");
        arrayList.add("Elemento 3");

        System.out.println(arrayList);
        arrayList.add(1, "Elemento 2");

        System.out.println(arrayList);
        System.out.println(arrayList.get(1));

        arrayList.remove(0);
        arrayList.remove("Elemento C");

        System.out.println("Tamanho do vetor: " + arrayList.size());

        boolean existe = arrayList.contains("Elemento 3");
        if (existe){
            System.out.println("Elementos encontrados");
        }else{
            System.out.println("Elemento não existe no vetor");
        }
        int posicao = arrayList.indexOf("Elemento 3");
        if (posicao > -1) {
            System.out.println("Elementos encontrados na posição: " + posicao);
        }else{
            System.out.println("Não existe no vetor");
        }
    }
}
