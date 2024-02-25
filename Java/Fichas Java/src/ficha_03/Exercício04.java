package ficha_03;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Introduza um número:");
        num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

    }
}
