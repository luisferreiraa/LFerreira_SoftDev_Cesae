package PL_04;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Jogador 1 - Introduza um número: ");
        input.nextInt(valor1);

        do {
            System.out.println("Jogador 2 - Tente adivinhar o número: ");
            input.nextInt(valor2);

        } while (valor2 != valor1);
    }
}
