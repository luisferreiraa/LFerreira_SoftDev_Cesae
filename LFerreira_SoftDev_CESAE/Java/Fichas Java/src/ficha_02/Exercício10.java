package ficha_02;

import java.util.Scanner;

public class Exercício10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1, n2;
        String operacao;

        System.out.println("Insira o número 1:");
        n1 = input.nextInt();

        System.out.println("Insira o número 2:");
        n2 = input.nextInt();

        System.out.println("Escolha a operação:");
        operacao = input.next();

        switch (operacao) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Opção seleccionada não disponível.");

        }

    }
}
