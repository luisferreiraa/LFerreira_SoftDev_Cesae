package ficha_03;

import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Introduza um número de início:");
        n1 = input.nextInt();

        System.out.println("Introduza um número de fim:");
        n2 = input.nextInt();

        for (int i = n1; i >= n1 && i <= n2; i++) {
            System.out.println(i);
        }
    }
}
