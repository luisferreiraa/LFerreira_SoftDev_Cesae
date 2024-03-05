import java.util.Scanner;

public class Ex_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, i, fatorial;

        System.out.println("Introduza um número: ");
        num = input.nextInt();

        i = 1;
        fatorial = 1;

        while (i <= num) {

            fatorial *= i;
            i++;
        }

        System.out.println("O fatorial é: " + fatorial);
    }
}
