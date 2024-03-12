import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Insira um número no Array[" + i + "]: ");
            vetor1[i] = input.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Insira um número no Array[" + i + "]: ");
            vetor2[i] = input.nextInt();
        }

        for (int m = 0; m < 10; m++) {
            matriz[m][0] = vetor1[m];
            matriz[m][1] = vetor2[m];
        }

        // Imprime os valores lado a lado
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][0] + " "); // Valor da primeira coluna
            System.out.println(matriz[i][1]); // Valor da segunda coluna
        }

    }
}
