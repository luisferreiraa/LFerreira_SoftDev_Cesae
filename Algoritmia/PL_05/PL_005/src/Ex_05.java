import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int soma = 0;
        int media;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("Soma dos vetores: " + soma);

        media = soma/ vetor.length;
        System.out.println("Média: " + media);

        }
    }

