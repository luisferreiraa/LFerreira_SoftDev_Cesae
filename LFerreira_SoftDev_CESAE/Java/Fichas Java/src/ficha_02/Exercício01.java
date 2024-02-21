package ficha_02;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Insira um número: ");
        n1 = input.nextInt();
        System.out.println("Insira um número: ");
        n2 = input.nextInt();

        if (n1 > n2) {
            System.out.println("Maior n1: " + n1);
        } else {
            if (n2 > n1) {
                System.out.println("Maior n2: " + n2);
            } else {
                System.out.println("Os números são iguais");
            }
        }
    }
}
