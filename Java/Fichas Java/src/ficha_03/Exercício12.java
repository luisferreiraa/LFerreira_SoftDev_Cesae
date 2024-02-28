package ficha_03;

import java.util.Scanner;

public class Exercício12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0, c25 = 0, c50 = 0, c75 = 0, c100 = 0;

        while (num >= 0) {

            System.out.println("Introduza um número:");
            num = input.nextInt();

            if (num >= 0) {

                if (num <= 25) {
                    c25 = c25 + 1;

                } else if (num <= 50) {
                    c50 = c50 + 1;

                } else if (num <= 75) {
                    c75 = c75 + 1;

                } else if (num <= 100) {
                    c100 = c100 + 1;
                }
            }
        }

        System.out.println("00-25: " + c25);
        System.out.println("26-50: " + c50);
        System.out.println("51-75: " + c75);
        System.out.println("76-100: " + c100);

    }
}
