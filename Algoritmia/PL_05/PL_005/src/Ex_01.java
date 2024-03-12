import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Array[" + i + "]: ");

            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }
    }
}
