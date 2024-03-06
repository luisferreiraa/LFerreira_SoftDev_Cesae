import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int n1;
        int n2;
        int soma;

        System.out.println("Introduza um número: ");
        n1 = input.nextInt();

        System.out.println("Introduza um número: ");
        n2 = input.nextInt();

        soma = n1 + n2;

        System.out.println("Soma: " + soma);

    }
}
