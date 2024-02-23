package ficha_02;

import java.util.Scanner;

public class Exercício15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza três números:");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        System.out.println("Ordem crescente (c) ou decrescente (d)?");
        char opcao = input.next().charAt(0);

        if (opcao == 'c') {

            if (n1 > n2) {
                double nX = n1;
                n1 = n2;
                n2 = nX;
            }
            if (n2 > n3) {
                double nX = n2;
                n2 = n3;
                n3 = nX;

                if (n1 > n2) {
                    double nX2 = n1;
                    n1 = n2;
                    n2 = nX2;
                }
            }
            System.out.println("Ordem crescente são: " + n1 + ", " + n2 + ", " + n3);
        } else if (opcao == 'd') {

            if (n1 < n2) {
                double nX = n1;
                n1 = n2;
                n2 = nX;
            }
            if (n2 < n3) {
                double nX = n2;
                n2 = n3;
                n3 = nX;

                if (n1 < n2) {
                    double nX2 = n1;
                    n1 = n2;
                    n2 = nX2;
                }
            }
            System.out.println("Ordem decrescente: " + n1 + ", " + n2 + ", " + n3);
        } else {
            System.out.println("Escolha novamente.");
        }
    }

}

