package ficha_03;

import java.util.Scanner;

public class Exercício05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        String msg;

        System.out.println("Introduza um número:");
        num = input.nextInt();

        input.nextLine();

        System.out.println("Introduza uma mensagem:");
        msg = input.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println(msg);
        }
    }
}
