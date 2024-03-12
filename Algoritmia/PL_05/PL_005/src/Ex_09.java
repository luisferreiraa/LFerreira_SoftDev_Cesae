import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz.length; k++) {
                System.out.println("Insira um número na Matriz [" + i + "][" + k + "]: ");
                matriz[i][k] = input.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int k = 0; k < matriz.length; k++) {
                System.out.print(matriz[i][k] + " ");
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz.length; k++) {
                soma += matriz[i][k];
            }
        }
        System.out.println();
        System.out.println("Soma: " + soma);
    }
}
