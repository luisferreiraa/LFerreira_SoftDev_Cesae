package ficha_03;

import java.util.Scanner;

public class Exercício13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nStart;
        int nEnd;

        System.out.println("Introduza um número de início:");
        nStart = input.nextInt();

        System.out.println("Introduza um número de fim:");
        nEnd = input.nextInt();

        for (int i = nStart; i <= nEnd; i++) {

            if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
