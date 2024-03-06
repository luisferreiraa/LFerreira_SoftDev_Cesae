import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N, contador, soma;

        System.out.println("Introduza um número: ");
        N = input.nextInt();

        soma = 0;
        contador = 0;

        while (contador<=N) {

            soma = soma + contador;
            contador++;
        }

        System.out.println("A soma de 1 a " + N + " é " + soma);

    }
}
