import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maior;
        int menor;

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.println("Insira um número na Matriz[" + i + "][" + k + "]: ");
                matriz[i][k] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int k = 0; k < 3; k++) {
                System.out.print(matriz[i][k] + " ");
            }
        }

        System.out.println();

        maior = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (matriz[i][k] > maior) {
                    maior = matriz[i][k];
                }
            }
        }
        System.out.println();
        System.out.println("Maior: " + maior);

        menor = matriz[2][2];

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (matriz[i][k] < menor) {
                    menor = matriz[i][k];
                }
            }
        }

        System.out.println();
        System.out.println("Menor: " + menor);
    }
}
