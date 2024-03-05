import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int numero;

        System.out.println("Introduza um número:");
        numero = input.nextInt();

        while (numero != -1) {
            soma += numero;
            contador++;

            System.out.println("Introduza um número:");
            numero = input.nextInt();
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Nenhum número foi introduzido, não é possível calcular a média.");
        }

        input.close();
    }
}

