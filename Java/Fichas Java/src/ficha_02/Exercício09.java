package ficha_02;

import java.util.Scanner;

public class Exercício09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Insira o número 1:");
        n1 = input.nextInt();

        System.out.println("Insira o número 2:");
        n2 = input.nextInt();

        System.out.println("Insira o número 3:");
        n3 = input.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("Num menor: " + n1);
        }

        if (n2 < n1 && n2 < n3) {
            System.out.println("Num menor: " + n2);
        }

        if (n3 < n1 && n3 < n2) {
            System.out.println("Num menor: " + n3);
        }


    }
}
