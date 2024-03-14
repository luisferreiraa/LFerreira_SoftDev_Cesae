package Ficha_04;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, contador=0;

        System.out.println("Jogador 1 - Introduza um número (de 0 a 100): ");
        valor1 = input.nextInt();

        do {

            System.out.println("Jogador 2 - Tente adivinhar o número: ");
            valor2 = input.nextInt();

            contador++;

            if (valor2 < valor1) {
                System.out.println("O valor que introduziu é menor.");

            } else if (valor2 > valor1) {
                System.out.println("O valor que introduziu é maior.");
            }

        } while (valor2 != valor1);

        System.out.println("Bingo! Parabéns");
        System.out.println("Precisou de " + contador + " tentativas para acertar.");

    }
}
