package Aula2;

public class Teste {
    public static void main(String[] args) throws Exception {
        VetorObjeto v2 = new VetorObjeto(5);

        Contato c1 = new Contato("Lucas Moura", "9999-9959", "clebinho@gmail.com");
        Contato c2 = new Contato("Jonathan Calleri", "9999-9959", "paulinho@gmail.com");
        Contato c3 = new Contato("Luciano Neves", "9999-9959", "kilinha@gmail.com");

        try{
            v2.adiciona(c1);
            v2.adiciona(c2);
            v2.adiciona(c3);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Tamanho do vetor: " + v2.tamanho());
        System.out.println(v2);
    }
}

