import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, aux;

        System.out.println("Introduza valor 1: ");
        valor1 = input.nextInt();
        System.out.println("Introduza valor 2: ");
        valor2 = input.nextInt();

        System.out.println(valor1 + " " + valor2);

        aux = valor1;
        valor1 = valor2;
        valor2 = aux;

        System.out.println(valor1 + " " + valor2);

    }
}
