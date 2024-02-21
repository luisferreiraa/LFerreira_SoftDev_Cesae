package ficha_01;

import java.util.Scanner;

public class Exercício06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Introduza valor 1");
        valor1 = input.nextInt();

        System.out.println("Introduza valor 2");
        valor2 = input.nextInt();

        System.out.println("\nValor 1 inicial: "+valor1);
        System.out.println("Valor 2 inicial "+valor2);

        // Trocar
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("\nValor 1 trocado: "+valor1);
        System.out.println("Valor 2 trocado "+valor2);


    }
}
