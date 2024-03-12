import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, opcao;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        do {


            System.out.println("1. Par ou ímpar.");
            System.out.println("2. Positivo ou negativo.");
            System.out.println("3. Primo ou não primo.");
            System.out.println("4. Perfeito ou não perfeito.");
            System.out.println("5. Triangular ou não triangular.");
            System.out.println("6. Trocar de número.");
            System.out.println("7. Sair.");

            System.out.println("Seleccione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (funcoes.par(num)) {
                        System.out.println("É par.");
                    } else {
                        System.out.println("É impar.");
                    }
                    break;
                case 2:
                    if (funcoes.positivo(num)) {
                        System.out.println("É positivo.");
                    } else {
                        System.out.println("É negativo.");
                    }
                    break;
                case 3:
                    if (funcoes.primo(num)) {
                        System.out.println("É primo.");
                    } else {
                        System.out.println("Não é primo.");
                    }
                    break;
                case 4:
                    if (funcoes.perfeito(num)) {
                        System.out.println("É um número perfeito.");
                    } else {
                        System.out.println("Não é um número perfeito.");
                    }
                    break;
                case 5:
                    if (funcoes.triangular(num)) {
                        System.out.println("É triangular.");
                    } else {
                        System.out.println("Não é triangular.");
                    }
                    break;
                case 6:
                    System.out.println("Insira um número: ");
                    num = input.nextInt();
                    break;
                case 7:
                    if (opcao == 7) {
                        System.out.println("Hasta la vista, baby.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);

    }
}
