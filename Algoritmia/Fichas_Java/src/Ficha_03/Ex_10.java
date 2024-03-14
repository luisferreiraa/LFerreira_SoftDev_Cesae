package Ficha_03;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, i;

        System.out.println("Introduza um número (maior que 2): ");
        n = input.nextInt();

        i = 0;

        for (i=2; i <= n; i = i + 2) {

            System.out.println(i);
        }
    }
}
