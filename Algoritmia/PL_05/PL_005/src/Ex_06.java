import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        boolean crescente = true;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vetor[i + 1]) {
                crescente = false;
                break;
            }
        }

        System.out.println();

        if (crescente) {
            System.out.println("Está em ordem crescente.");
        } else {
            System.out.println("Não está em ordem crescente.");
        }

    }
}
