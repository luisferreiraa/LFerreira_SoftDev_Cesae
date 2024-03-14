package Ficha_01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nota1, nota2, nota3;

        System.out.println("Introduza nota 1:");
        nota1 = input.nextInt();

        System.out.println("Introduza nota 2:");
        nota2 = input.nextInt();

        System.out.println("Introduza nota 3:");
        nota3 = input.nextInt();

        System.out.println("Média Aritmética: " + (nota1 + nota2 + nota3) / 3);
        System.out.println("Média Ponderada: " + ((nota1 * 0.20) + (nota2 * 0.30) + (nota3 * 0.50)));
    }
}
