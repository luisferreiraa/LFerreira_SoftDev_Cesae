package Ficha_05;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {


            // Importar o Scanner
            Scanner input = new Scanner(System.in);

            // Declarar variáveis
            int[] vetor1 = new int[10];
            int[] vetor2 = new int[10];

            // Ler vetor 1
            for (int i = 0; i < 10; i++) {
                System.out.println("Insira um número no Array1[" + i + "]: ");
                vetor1[i] = input.nextInt();
            }

            // Imprimir vetor1
            for (int i = 0; i < 10; i++) {
                System.out.print(" " + vetor1[i]);
            }

            System.out.println();

            // Ler vetor 2
            for (int k = 0; k < 10; k++) {
                System.out.println("Insira um número no Array2[" + k + "]: ");
                vetor2[k] = input.nextInt();
            }

            // Imprimir vetor2
            for (int k = 0; k < 10; k++) {
                System.out.print(" " + vetor2[k]);
            }

        System.out.println();

            // Gerar matriz
            int[][] matriz = new int[10][2]; // Declarar matriz
            for (int m = 0; m < 10; m++) {
                matriz[m][0] = vetor1[m];
                matriz[m][1] = vetor2[m];
            }

            // Imprimir matriz
            for (int i = 0; i < 10; i++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(matriz[i][k] + "  ");
                System.out.println();
            }
        }
}
