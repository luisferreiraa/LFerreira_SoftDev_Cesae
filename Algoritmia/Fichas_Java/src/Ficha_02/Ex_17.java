package Ficha_02;

import java.util.Scanner;

public class Ex_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, desconto;

        System.out.println("Introduza o seu saldo médio: ");
        saldo = input.nextInt();

        if (saldo <= 2000) {

            System.out.println("O seu saldo: " + saldo);
            System.out.println("Nenhum crédito.");
        }

        if (saldo > 2000 && saldo <= 4000) {

            desconto = saldo * 0.20;
            System.out.println("20% do seu saldo: " + desconto);
        }

        if (saldo > 4000 && saldo <= 6000) {

            desconto = saldo * 0.30;
            System.out.println("30% do seu saldo: " + desconto);
        }

        if (saldo > 6000) {

            desconto = saldo * 0.40;
            System.out.println("40% do seu saldo: " + desconto);
        }
    }
}
