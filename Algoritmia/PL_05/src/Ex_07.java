import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorPar;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextInt();
        }

        // Inicializar o maior
        maiorPar = vetor[0];

        // Encontrar o maior numero par
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0 && vetor[i] > maiorPar)
                maiorPar = vetor[i];
        }

        if (maiorPar % 2 == 0) {
            System.out.println("Maior numero par é: " + maiorPar);
        } else {
            System.out.println("Impossível apresentar resultado.");
        }


    }
}
