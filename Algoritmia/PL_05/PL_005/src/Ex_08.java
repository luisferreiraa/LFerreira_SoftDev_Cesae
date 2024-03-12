import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz.length; k++) {
                System.out.println("Insira um número na Matriz[" + i + "][" + k + "]: ");
                matriz[i][k] = input.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int k = 0; k < matriz.length; k++) {
                System.out.print(matriz[i][k] + " ");

            }
        }


    }
}
