import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int menor;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor: ");
            vetor[i] = input.nextInt();
        }

        // Encontrar o menor elemento
        menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor)
                menor = vetor[i];
        }
        System.out.println("O valor menor é: " + menor);
    }
}
