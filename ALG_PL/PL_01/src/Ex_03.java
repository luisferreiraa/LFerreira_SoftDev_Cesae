import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base, altura;

        System.out.println("Introduza a base: ");
        base = input.nextInt();

        System.out.println("Introduza a altura: ");
        altura = input.nextInt();

        System.out.println("Área do rectângulo: " + (base * altura));

        System.out.println("Perímetro do rectângulo: " + 2 * (base + altura));

    }
}
