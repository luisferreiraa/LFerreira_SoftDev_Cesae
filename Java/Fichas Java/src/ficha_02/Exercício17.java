package ficha_02;

import java.util.Scanner;

public class Exercício17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo;

        System.out.print("Introduza o seu saldo médio do último ano: ");
        saldo = input.nextDouble();

        if (saldo <= 2000) {
            System.out.print("Nenhum crédito");
        }

        if (saldo > 2000 && saldo <= 4000) {
            saldo = (saldo*0.20);
            System.out.print("20%= " + saldo);
        }

        if (saldo > 4000 && saldo <= 6000) {
            saldo = (saldo*0.30);
            System.out.print("30%= " + saldo);
        }

        if (saldo > 6000) {
            saldo = (saldo*0.40);
            System.out.print("40%= " + saldo);
        }
    }
}
