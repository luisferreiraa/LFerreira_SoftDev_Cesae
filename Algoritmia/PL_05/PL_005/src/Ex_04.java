import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int menor;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Menor: " + menor);
    }
}
