import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        // Importar o scanner
        Scanner input = new Scanner(System.in);

        // Ler o número de elementos do vetor
        System.out.println("Insira o número de elementos do vetor: ");
        int tamanhoVetor = input.nextInt();

        int[] vetor = new int [tamanhoVetor];

        // Ler vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Insira o Array[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Imprimir o menu
        System.out.println("7. Maior elemento.");
        System.out.println("8. Menor elemento.");
        System.out.println("9. Crescente ou não crescente.");

        System.out.println("Insira uma opção: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 7:
                System.out.println("Maior elemento: " + funcoes.encontrarMaior(vetor));
                break;
            case 8:
                System.out.println("Menor elemento: " + funcoes.encontrarMenor(vetor));
                break;
            case 9:
                if (funcoes.estaCrescente(vetor)) {
                    System.out.println("Está crescente.");
                } else {
                    System.out.println("Não está crescente.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

    }
}
