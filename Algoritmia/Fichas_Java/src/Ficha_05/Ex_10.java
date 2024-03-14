package Ficha_05;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][5];
        int numPesquisa;
        int contador = 0;

        // Ler matriz
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.println("Introduza o próximo número: ");
                matriz[i][k] = input.nextInt();
            }
        }

        // Imprimir matriz
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 5; k++)
                System.out.print(matriz[i][k] + "  ");
            System.out.println();
        }

        // Ler número para pesquisa
        System.out.println("Introduza um número para pesquisar: ");
        numPesquisa = input.nextInt();

        // Encontrar número na matriz
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 5; k++)
                if (matriz[i][k] == numPesquisa) {
                    contador++;
                }
        }

        // Imprimir número de posições na matriz
        System.out.println("Há " + contador + " posições na matriz com o número " + numPesquisa);
    }
}