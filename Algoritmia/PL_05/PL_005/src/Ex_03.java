import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int [10];
        int maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        for (int i = 0; i< vetor.length; i++) {
            if (vetor[i] >  maior) {
                maior = vetor[i];
            }
        }
        System.out.println("Maior: " + maior);

    }
}
