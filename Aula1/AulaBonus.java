package Aula1;
import java.util.Scanner;
public class AulaBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura[] = new double[7];
        System.out.println("Digite todas as temperaturas da semana começando por domingo:");
        for (int i = 0; i < temperatura.length; i++){
            temperatura[i] = sc.nextDouble();

        }
        double soma = 0;
        for (int i = 0; i<temperatura.length; i++){
            soma += temperatura[i];
        }
        double media = soma / temperatura.length;
        int contadormaior  = 0;
        int contamenor = 0;

        for (int i = 0; i < temperatura.length; i++){
            if (temperatura[i] > media){
                contadormaior++;
            }else if (temperatura[i] < media){
                contamenor++;
            }
        }

        System.out.println("Media: " + media);

        System.out.println("Quantidade maior que a media" + contadormaior);
        System.out.println("Quantidade menor que a media" + contamenor);
    }
}
