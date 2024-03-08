import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int numPesquisa;
        boolean existe = false;
        int contador = 0;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println();

        // Ler número para pesquisa
        System.out.println("Introduza um número para pesquisar: ");
        numPesquisa = input.nextInt();

        System.out.println();

        // Imprimir número para pesquisa
        System.out.println("Número a pesquisar: " + numPesquisa);

        // Encontrar número
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numPesquisa) {
                existe = true;
            }
        }

        System.out.println();

        // Imprimir se existe ou se não existe
        if (existe) {
            System.out.println(numPesquisa + " existe no Array.");
        } else {
            System.out.println(numPesquisa + " não existe no Array.");
        }

        // Procurar quantas vezes existe
        for (int i = 0; i < 10; i++) {
                if (vetor[i] == numPesquisa) {
                    contador++;
                }
        }

        // Imprimir número de posições na matriz
        System.out.println("Há " + contador + " posições no vetor com o número " + numPesquisa);

        // Procurar e imprimir índice das ocorrências
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == numPesquisa) {
                System.out.println("Array[" + i +"]");
            }
        }
    }
}
