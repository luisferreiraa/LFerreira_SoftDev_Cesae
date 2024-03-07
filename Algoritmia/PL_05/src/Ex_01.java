import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Imprimir o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]: " + vetor[i]);
        }

    }
}
