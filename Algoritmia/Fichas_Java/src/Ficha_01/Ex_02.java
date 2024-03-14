package Ficha_01;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int n1, n2;

        System.out.println("Introduza um número:");
        n1 = input.nextInt();

        System.out.println("Introduza um número:");
        n2 = input.nextInt();

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + (n1 * n2));
        System.out.println("Divisão: " + (n1 / n2));
    }
}
