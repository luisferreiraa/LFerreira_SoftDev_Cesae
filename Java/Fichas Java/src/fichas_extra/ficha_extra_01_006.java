package fichas_extra;

import java.util.Scanner;

public class ficha_extra_01_006 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ano;

        System.out.println("Introduza um ano:");
        ano = input.nextInt();

        if (ano % 4 == 0) {
            System.out.println("É bissexto.");
        } else {
            System.out.println("Não é bissexto.");
        }
    }
}
