package ficha_03;

import java.util.Scanner;

public class Exercício08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1;

        System.out.println("Introduza um número:");
        n1 = input.nextInt();

        for (int i = n1 - 5; i < n1; i++) {
            if (i >= 0) {
                System.out.println(i);
            }
        }

        for (int i = n1 + 1; i <= n1 + 5; i++) {
            System.out.println(i);
        }
    }
}
