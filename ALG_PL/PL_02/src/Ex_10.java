import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1, n2;
        String operacao;

        System.out.println("Introduza um número real: ");
        n1 = input.nextDouble();

        System.out.println("Introduza outro número real: ");
        n2 = input.nextDouble();

        System.out.println("Escolha a operação aritmética (+,-,* ou /): ");
        operacao = input.next();

        switch (operacao) {
            case "+":
                System.out.println("Soma: " + (n1 + n2));
                break;
            case "-":
                System.out.println("Subtração: " + (n1-n2));
                break;
            case "*":
                System.out.println("Multiplicação: " + (n1*n2));
                break;
            case "/":
                System.out.println("Divisão: " + (n1/n2));
            default:
                System.out.println("Erro. Operação indisponível.");
        }

    }
}
