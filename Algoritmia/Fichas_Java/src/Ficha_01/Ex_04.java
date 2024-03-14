package Ficha_01;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, pi;

        pi = 3.14;

        System.out.println("Introduza a dimensão do raio: ");
        raio = input.nextInt();

        System.out.println("Área da circunferência: " + pi * (raio * raio));
    }
}
