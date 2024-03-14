package Ficha_04;

import java.util.Scanner;

public class Ex_04_v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        for (int divisor = 2; divisor < num; divisor++) {

            if (num % divisor == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("Não primo");
        }
    }


}

