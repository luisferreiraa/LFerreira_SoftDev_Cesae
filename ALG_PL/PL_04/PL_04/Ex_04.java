package PL_04;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, divisor;

        do {
            System.out.println("Introduza um número: ");
            num = input.nextInt();

            int divisor = 2;

            while (divisor <= num / 2 && num % divisor != 0) {
                divisor++;
            }

            if (divisor > num / 2) {
                System.out.println("É um número primo.");
            } else {
                System.out.println("Não é um número primo.");
            }

        } while (num > 0);
    }
}
