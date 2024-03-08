import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorPar;
        boolean jaTemPar = false;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextInt();
        }

        maiorPar = vetor[0];

        // Encontrar o maior numero par
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {
                if (!jaTemPar) { // Primeiro par que encontra independente do tamanho
                    maiorPar = vetor[i];
                    jaTemPar = true;
                }

                if (vetor[i] > maiorPar) {
                    maiorPar = vetor[i];
                }
            }
        }

        // Apresentar o maior par
        if (maiorPar % 2 == 0) {
            System.out.println("Maior Par: " + maiorPar);
        } else {
            System.out.println("Não tem pares!");
        }


    }
}
