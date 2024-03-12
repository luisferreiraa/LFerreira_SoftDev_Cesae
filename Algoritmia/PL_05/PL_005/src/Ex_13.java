import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[4][4];
        int somaDiagonal = 0;

        // Ler Matriz
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.println("Insira o número da Matriz [" + i + "][" + k + "]: ");
                matriz[i][k] = input.nextInt();
            }
        }

        // Somar valores da diagonal principal
        for (int i = 0; i < 4; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("Soma da Diagonal Principal: " + somaDiagonal);


    }
}
