package Ficha_05;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int maior;
        int menor;

        // Ler matriz
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.println("Introduza o próximo número: ");
                matriz[i][k] = input.nextInt();
            }
        }

        // Imprimir matriz
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++)
                System.out.print(matriz[i][k] + "  ");
            System.out.println();
        }

        // Encontrar número maior
        maior = matriz[0][1];
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (matriz[i][k] > maior) {
                    maior = matriz[i][k];
                }
            }
        }
        System.out.println("Maior número na matriz: " + maior);

        // Encontrar número maior
        menor = matriz[0][1];
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (matriz[i][k] < menor) {
                    menor = matriz[i][k];
                }
            }
        }
        System.out.println("Menor número na matriz: " + menor);


    }
}
