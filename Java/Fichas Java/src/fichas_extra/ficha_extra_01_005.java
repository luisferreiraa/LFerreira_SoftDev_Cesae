package fichas_extra;

import java.util.Scanner;

public class ficha_extra_01_005 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 31;
        int palpite;

        System.out.println ("Adivinhe o número (1 a 100):");
        palpite = input.nextInt();

        if (palpite < num) {
            System.out.println ("Muito baixo.");
        } else if (palpite > num) {
            System.out.println ("Muito alto.");
        } else if (palpite == num) {
            System.out.println ("Acertaste!");
        }

        if (palpite != num) {
            System.out.println ("Tenta outra vez:");
            palpite = input.nextInt();
        }

        if (palpite < num) {
            System.out.println ("Muito baixo. Ficaste sem tentativas.");
        } else if (palpite > num) {
            System.out.println ("Muito alto. Ficaste sem tentativas.");
        } else if (palpite == num) {
            System.out.println ("Acertaste!");
        }
    }
}
