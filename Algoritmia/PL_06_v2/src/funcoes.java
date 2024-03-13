import java.util.Scanner;

public class funcoes {

    /**
     * Devolve o som feito por um animal listado.
     *
     * @param animal
     */
    public static void fazerBarulho(String animal) {

        switch (animal) {
            case "Cão":
                System.out.println("Au au au");
                break;
            case "Gato":
                System.out.println("Miau");
                break;
            case "Peixe":
                System.out.println("Glub Glub");
                break;
            case "Vaca":
                System.out.println("Muuuu");
                break;
            case "Porco":
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
        int sum = 1;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
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
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    /**
     * Encontra o menor elemento de um vetor.
     *
     * @param vetor
     * @return
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
            if (vetor[i] < vetor[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void desenharQuadradro(char caracter, int linhas, int colunas) {
        
    }

}










