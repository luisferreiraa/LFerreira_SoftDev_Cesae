import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int n =4;
        int[][] matriz = new int[n][n];
        int soma = 0;

        // Ler matriz
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.println("Introduza o próximo número: ");
                matriz[i][k] = input.nextInt();

            }
        }

        // Imprimir matriz
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++)
                System.out.print(matriz[i][k] + "  ");
            System.out.println();
        }

        // Somar diagonal
        for (int i = 0; i < n; i++) {
                soma += matriz[i][i];
        }

        System.out.println(soma);


    }
}
