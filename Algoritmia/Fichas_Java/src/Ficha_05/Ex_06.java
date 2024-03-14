package Ficha_05;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        boolean crescente = true;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) {
                // O vetor deixou de ser crescente
                crescente = false;
                break;
            }
        }

        if (crescente) {
            System.out.println("Está em ordem crescente.");
        } else {
            System.out.println("Não está em ordem crescente.");
        }


    }
}
