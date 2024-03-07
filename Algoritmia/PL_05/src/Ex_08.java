import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];

        // Ler matriz
        System.out.println("Introduza 9 números: ");
        for (int i = 0; i < 3; i++)
            for (int k = 0; k < 3; k++)
                matriz[i][k] = input.nextInt();

        // Imprimir matriz
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++)
                System.out.print(matriz[i][k] + " ");
            System.out.println();

        }
    }
}

