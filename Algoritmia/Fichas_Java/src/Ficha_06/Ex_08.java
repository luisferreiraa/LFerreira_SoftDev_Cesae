package Ficha_06;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        // Importar o scanner
        Scanner input = new Scanner(System.in);

        // Declarar matrizes
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        // Declarar variáveis
        int somatorio;

        // Ler Matriz 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Preencha a Matriz 1: ");
                matriz1[i][j] = input.nextInt();
            }
        }

        // Ler Matriz 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Preencha a Matriz 2: ");
                matriz2[i][j] = input.nextInt();
            }
        }

        funcoes.somarMatrizes(matriz1, matriz2);
        funcoes.somatorioMatrizes(matriz1, matriz2);

        System.out.println(funcoes.somatorioMatrizes(somatorio));

    }
}
