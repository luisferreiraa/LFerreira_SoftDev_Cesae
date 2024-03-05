package PL_04;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, contador;

        System.out.println("Jogador 1 - Introduza um número: ");
        valor1 = input.nextInt();

        contador = 1;

        do {

            System.out.println("Jogador 2 - Tente adivinhar o número: ");
            valor2 = input.nextInt();

            if (valor2 < valor1) {
                System.out.println("O valor que introduziu é menor.");

            } else if (valor2 > valor1) {
                System.out.println("O valor que introduziu é maior.");
            }

            if (valor2 != valor1) {
                contador++;
            }

        } while (valor2 != valor1);

        System.out.println("Precisou de " + contador + " para acertar.");

    }
}
