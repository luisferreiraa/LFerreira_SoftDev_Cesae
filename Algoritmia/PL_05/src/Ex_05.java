import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[10];
        double somatorio = 0;
        double media = 0;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor: ");
            vetor[i] = input.nextDouble();
        }

        // Calcular a media dos elementos
        for (int i = 0; i < vetor.length; i++) {
            somatorio = somatorio + vetor[i];
            media = somatorio/ vetor.length;
        }

        // Imprimir média
        System.out.println("Média: " + media);

    }
}
