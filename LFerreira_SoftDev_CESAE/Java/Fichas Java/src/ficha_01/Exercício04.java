package ficha_01;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, area, pi=3.1415;

        System.out.println("Introduza o raio da circunferência");
        raio = input.nextInt();

        /* System.out.println ("Área: " + (pi*raio*raio); */
        area = pi*raio*raio;
        System.out.println("Área da circunferência: " + area);
    }

}
