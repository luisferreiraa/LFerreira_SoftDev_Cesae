package Ficha_03;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.println("Introduza um número (início): ");
        inicio = input.nextInt();

        System.out.println("Introduza um número (fim): ");
        fim = input.nextInt();


        while (inicio <= fim) {
            inicio = inicio + 1;
            if (inicio % 5 == 0) {
                System.out.println(inicio);
            }


       /*
        for (i = nInicio; i <= nFim; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
*/
        }


    }
}
