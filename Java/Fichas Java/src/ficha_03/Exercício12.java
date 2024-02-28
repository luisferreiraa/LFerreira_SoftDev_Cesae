package ficha_03;

import java.util.Scanner;

public class Exercício12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 1, c25 = 0, c50 = 0, c75 = 0, c100 = 0;

        while (num > -1) {

            System.out.println("Introduza um número:");
            num = input.nextInt();

        }

        if (num >= 0 && num <= 25) {
            c25 = c25 + 1;
            System.out.println("00-25: " + c25);
        }

        else if (num >= 26 && num <= 50) {
            c50 = c50 + 1;
            System.out.println("26-50: " + c50);
        }

        else if (num >= 51 && num <= 75) {
            c75 = c75 + 1;
            System.out.println("51-75: " + c75);

        }

        else if (num >= 76 && num <= 100) {
            c100 = c100 + 1;
            System.out.println("76-100: " + c100);

        }

    }
}
