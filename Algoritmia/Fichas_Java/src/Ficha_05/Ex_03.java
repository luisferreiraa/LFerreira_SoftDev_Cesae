package Ficha_05;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maior;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextInt();
        }

        // Inicializar o maior
        maior = vetor[0];

        // Encontrar o maior elemento
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior)
                maior = vetor[i];
        }

        System.out.println("O valor maior é: " + maior);
    }
}
