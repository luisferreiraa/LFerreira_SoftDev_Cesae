import java.util.Scanner;

public class Ex_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor, n200, n100, n50, n20, n10, n5;

        System.out.println("Introduza um valor em euros (multiplo de 5): ");
        valor = input.nextInt();

        // Notas de 200
        n200 = valor / 200;
        System.out.println("Notas de 200: " + n200);
        valor = valor % 200;

        // Notas de 100
        n100 = valor / 100;
        System.out.println("Notas de 100: " + n100);
        valor = valor % 100;

        // Notas de 50
        n50 = valor / 50;
        System.out.println("Notas de 50: " + n50);
        valor = valor % 50;

        // Notas de 20
        n20 = valor / 20;
        System.out.println("Notas de 20: " + n20);
        valor = valor % 20;

        // Notas de 10
        n10 = valor / 10;
        System.out.println("Notas de 10: " + n10);
        valor = valor % 10;

        // Notas de 5
        n5 = valor / 5;
        System.out.println("Notas de 5: " + n5);
        valor = valor % 5;
    }
}
