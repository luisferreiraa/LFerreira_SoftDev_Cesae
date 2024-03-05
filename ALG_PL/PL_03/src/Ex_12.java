import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0, soma25 = 0, soma50 = 0, soma75 = 0, soma100 = 0;

        while (numero >= 0) {

            System.out.println("Introduza um número: ");
            numero = input.nextInt();

            if (numero > 0) {
                if (numero <= 25) {
                    soma25 = soma25 + 1;
                } else if (numero <= 50) {
                    soma50 = soma50 + 1;
                } else if (numero <= 75) {
                    soma75 = soma75 + 1;
                } else if (numero <= 100) {
                    soma100 = soma100 + 1;
                }

            }
        }

        System.out.println("00-25: " + soma25);
        System.out.println("26-50: " + soma50);
        System.out.println("51-75: " + soma75);
        System.out.println("76-100: " + soma100);
    }
}
