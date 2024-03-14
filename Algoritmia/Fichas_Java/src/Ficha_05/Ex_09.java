package Ficha_05;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[5][5];
        int soma;

        // Ler matriz

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.println("Introduza o próximo número: ");
                matriz[i][k] = input.nextInt();
            }
        }

        // Imprimir matriz
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++)
                System.out.print(matriz[i][k] + "  ");
            System.out.println();
        }

                // Somar todos os elemento da matriz

                soma = 0;

                for (int i = 0; i < 5; i++) {
                    for (int k = 0; k < 5; k++) {
                        soma += matriz[i][k];
                    }
                }

                // Imprimir soma todos os elemento da matriz

                System.out.println("A soma de todos os elementos da matriz é " + soma);




    }
}



