package ficha_02;

import java.util.Scanner;

public class Exercício16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Introduza um valor (deve ser multiplo de 5): ");
        int valor = input.nextInt();

        int n200 = valor / 200;
        valor %= 200;
        int n100 = valor / 100;
        valor %= 100;
        int n50 = valor / 50;
        valor %= 50;
        int n20 = valor / 20;
        valor %= 20;
        int n10 = valor / 10;
        valor %= 10;
        int n5 = valor / 5;
        valor %= 5;

        System.out.println("Notas de 200 " + n200);
        System.out.println("Notas de 100 " + n100);
        System.out.println("Notas de 50 " + n50);
        System.out.println("Notas de 20 " + n20);
        System.out.println("Notas de 10 " + n10);
        System.out.println("Notas de 5 " + n5);


    }
}
