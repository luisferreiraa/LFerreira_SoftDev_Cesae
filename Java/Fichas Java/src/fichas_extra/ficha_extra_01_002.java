package fichas_extra;

import java.util.Scanner;

public class ficha_extra_01_002 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double peso;

        System.out.println("Introduza o seu peso: ");
        peso = input.nextInt();

        if (peso > 0) {

            peso = peso * 0.16;
            System.out.println(peso);
        } else {
            System.out.println("Impossível calcular.");
        }
    }
}
