package ficha_01;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base, altura;

        System.out.println("Introduza a base");
        base = input.nextInt();

        System.out.println("Introduza a altura");
        altura = input.nextInt();


        System.out.println("Area: " + (base*altura));


        System.out.println("Perimetro: " + (2*(base+altura)));

    }
}
