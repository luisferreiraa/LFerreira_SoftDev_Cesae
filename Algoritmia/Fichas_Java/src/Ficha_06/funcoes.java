package Ficha_06;

import java.util.Scanner;

public class funcoes {

    /**
     * Devolve o som feito por um animal listado.
     *
     * @param animal
     */
    public static void fazerBarulho(String animal) {

        // Converte tudo para maiúsculas
        animal = animal.toUpperCase();

        switch (animal) {
            case "CÃO":
                System.out.println("Au au au");
                break;
            case "GATO":
                System.out.println("Miau");
                break;
            case "PEIXE":
                System.out.println("Glub Glub");
                break;
            case "VACA":
                System.out.println("Muuuu");
                break;
            case "PORCO":
                System.out.println("Oinc oinc");
                break;
            default:
                System.out.println("Opção inválida. Esse animal não existe na lista.");
        }
    }

    /**
     * Lê números até que seja inserido um número inteiro positivo.
     *
     * @return
     */
    public static int inteiroPositivo() {

        Scanner input = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduza um número: ");
            num = input.nextInt();
        } while (num < 0);

        return num;
    }

    /**
     * Imprime o número de asteriscos iterados.
     *
     * @param quantidadeAsteriscos
     */
    public static void imprimirAsteriscos(int quantidadeAsteriscos) {

        for (int i = 0; i < quantidadeAsteriscos; i++) {
            System.out.print("*");
        }
    }

    /**
     * Lê um número e define se é par ou ímpar.
     *
     * @param num
     * @return
     */
    public static boolean par(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Lé um número e define se é um número positivo.
     *
     * @param num
     * @return
     */
    public static boolean positivo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Lê um número e define se é um número primo.
     */
    public static boolean primo(int num) {
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return false;
    }

    /**
     * Lê um número e define se é um número perfeito.
     */
    public static boolean perfeito(int num) {
        int somaDivisores = 0;

        for (int divisor = 1; divisor < num; divisor++) {

            if (num % divisor == 0) {
                somaDivisores = somaDivisores + divisor;
            }
        }

        if (num == somaDivisores) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Lê um número e define se é um número triangular.
     */
    public static boolean triangular(int num) {
        int soma = 0;
        for (int i = 1; soma <= num; i++) {
            soma = soma + i;
            if (soma == num)
                return true;
        }

        return false;
    }

    /**
     * Encontra o maior elemento de um vetor.
     *
     * @param vetor
     * @return
     */
    public static int encontrarMaior(int[] vetor) {

        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    /**
     * Encontra o menor elemento de um vetor.
     *
     * @param vetor vetor a ser analisado
     * @return menor elemento
     */
    public static int encontrarMenor(int[] vetor) {

        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    /**
     * Define se os elementos de um vetor estão em ordem crescente.
     *
     * @param vetor
     * @return
     */
    public static boolean estaCrescente(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Desenha um quadrado consoante o caracter, num linhas e num colunas inserido pelo utilizador.
     *
     * @param caracter
     * @param linhas
     * @param colunas
     */
    public static void desenharQuadradro(char caracter, int linhas, int colunas) {
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Resultado da soma de 2 matrizes inseridas pelo utilizador.
     *
     * @param matriz1
     * @param matriz2
     * @return
     */
    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {

        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    /**
     * Resultado do somatório dos elementos das matrizes.
     *
     * @param matriz1
     * @param matriz2
     */
    public static int somatorioMatrizes(int[][] matriz1, int[][] matriz2) {

        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int somatorio = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somatorio += matriz1[i][j];
            }
        }
        return somatorio;
    }


}










