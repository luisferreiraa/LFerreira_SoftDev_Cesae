package fichas_extra;

import java.util.Scanner;

public class ficha_extra_01_003 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double v1;

        System.out.println("Introduza o valor do produto: ");
        v1 = input.nextInt();

        if (v1 > 100.00) {
            v1 = v1 - (v1 * 0.10);
            System.out.println("Preço Final: " + v1 + " " + "(10% de desconto)");
        } else {
            System.out.println("Preço Final: " + v1 + " " + "Sem desconto");
        }

    }
}
