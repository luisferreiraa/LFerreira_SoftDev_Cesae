package Ficha_03;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Introduza número inicial: ");
        n1 = input.nextInt();

        System.out.println("Introduza número final: ");
        n2 = input.nextInt();

        for (int i = n1; i >= n1 && i <= n2; i++) {
            System.out.println(i);
        }

        /*

        while (n1 <= n2) {

        n1 = n1 + 1;

        }

         */
    }
}
