package Ficha_Extra_Arrays_Matrizes;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        System.out.println("Quantos elementos quer inserir no Array: ");
        int tamanho = input.nextInt();
        int[] vetor = new int[tamanho];
        int valorRemover;
        int novoTamanho;

        // Ler vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Perguntar valor a remover
        System.out.println("Insira o valor a remover: ");
        valorRemover = input.nextInt();

        // Encontrar valor
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorRemover) {
                contador++;
            }
        }
        System.out.println(contador); // Quantas vezes encontrou o valor a remover

        // novoTamanho = tamanho-contador;




    }
}
