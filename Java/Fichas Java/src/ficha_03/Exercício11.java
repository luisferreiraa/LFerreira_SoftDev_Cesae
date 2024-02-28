package ficha_03;

import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numL;
        int numS;
        int i;

        System.out.println("Introduza um número (limite):");
        numL = input.nextInt();

        System.out.println("Introduza um número (salto):");
        numS = input.nextInt();

                for (i = 0; i <= numL; i+= numS) {

                    System.out.print(i + " ");
        }
    }
}
