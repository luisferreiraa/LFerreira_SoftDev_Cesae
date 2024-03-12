import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int numPesquisar;
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.println("Insira um número na Matriz[" + i + "][" + k + "]: ");
                matriz[i][k] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int k = 0; k < 5; k++) {
                System.out.print(matriz[i][k] + " ");
            }
        }

        System.out.println();

        System.out.println("Insira um número para pesquisar: ");
        numPesquisar = input.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 5; k++) {
                if (matriz[i][k] == numPesquisar)
                contador++;
            }
        }

        System.out.println("Há " + contador + " posições na matriz com o número " + numPesquisar);



    }
}
