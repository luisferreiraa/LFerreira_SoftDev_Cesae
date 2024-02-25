package ficha_03;

import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Introduzir um número:");
        num = input.nextInt();

        for (int i = 2; i <= num; i += 2) {

            System.out.println(i);
        }

    }
}
