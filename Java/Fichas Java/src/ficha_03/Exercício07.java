package ficha_03;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1 = 1, n2 = 100, somatorio = 0;

        for (int i = n1; i >= n1 && i <= n2; i++) {
            System.out.println(i);
            somatorio += i;
        }

        System.out.println("Somatório: " + somatorio);
    }
}
