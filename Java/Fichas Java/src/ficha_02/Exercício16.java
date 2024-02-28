package ficha_02;

import java.util.Scanner;

public class Exercício16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numNotas, resto;


        System.out.println("Introduza um valor (deve ser multiplo de 5): ");
        int valor = input.nextInt();

        if (valor % 5 == 0) {

            //200
            numNotas = valor / 200;
            System.out.println("Notas de 200: " + numNotas);
            valor = valor % 200;

            //100
            numNotas = valor / 100;
            System.out.println("Notas de 100: " + numNotas);
            valor = valor % 100;

            numNotas = valor / 50;
            System.out.println("Notas de 50: " + numNotas);
            valor = valor % 50;

            numNotas = valor / 20;
            System.out.println("Notas de 20: " + numNotas);
            valor = valor % 20;

            numNotas = valor / 10;
            System.out.println("Notas de 10: " + numNotas);
            valor = valor % 10;

            numNotas = valor / 5;
            System.out.println("Notas de 5: " + numNotas);
            valor = valor % 5;


        } else {
            System.out.println("Valor inválido.");
        }

    }
}
