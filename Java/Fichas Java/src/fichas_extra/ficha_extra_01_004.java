package fichas_extra;

import java.util.Scanner;

public class ficha_extra_01_004 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String letra;

        System.out.println("Introduza uma letra:");
        letra = input.nextLine();

        switch (letra) {

            case "a":
                System.out.println("A letra é uma vogal.");
                break;
            case "e":
                System.out.println("A letra é uma vogal.");
                break;
            case "i":
                System.out.println("A letra é uma vogal.");
                break;
            case "o":
                System.out.println("A letra é uma vogal.");
                break;
            case "u":
                System.out.println("A letra é uma vogal.");
                break;
            default:
                System.out.println("A letra é uma consoante.");

        }
    }
}
