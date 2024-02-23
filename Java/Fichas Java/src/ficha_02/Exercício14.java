package ficha_02;

import java.util.Scanner;

public class Exercício14 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza três números:");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();


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

        System.out.println("Números por ordem crescente: " + n1 + ", " + n2 + ", " + n3);
    }
}
