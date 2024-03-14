package Ficha_Extra_Arrays_Matrizes;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        System.out.println("Quantos elementos quer inserir no Array: ");
        int n = input.nextInt();
        int[] vetor = new int[n];

        // Ler vetor
        for (int i = 0; i < n; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Imprimir o vetor
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
