package Ficha_03;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Introduza um número: ");
        n = input.nextInt();

        for (int i = n - 5; i < n; i++) {
            System.out.println(i);
        }

        for (int i = n + 1; i <= n + 5; i++) {
            System.out.println(i);
        }
    }
}
