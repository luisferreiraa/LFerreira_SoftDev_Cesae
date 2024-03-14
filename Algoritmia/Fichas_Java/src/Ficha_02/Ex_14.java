package Ficha_02;

import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3, temp;

        System.out.println("Introduz um número:");
        n1 = input.nextInt();

        System.out.println("Introduz um número:");
        n2 = input.nextInt();

        System.out.println("Introduz um número:");
        n3 = input.nextInt();

        if (n1 > n2) {

            temp = n1;
            n1 = n2;
            n2 = temp;
        }

        if (n2 > n3) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }

        if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }

        System.out.println("Números por ordem crescente: " + n1 + " " + n2 + " " + n3);


    }
}
