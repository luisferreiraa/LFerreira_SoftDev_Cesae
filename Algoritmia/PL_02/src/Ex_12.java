import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.println("Escolha uma opção: ");
        opcao = input.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Escolheu 1. Criar.");
                break;
            case 2:
                System.out.println("Escolheu 2. Atualizar.");
                break;
            case 3:
                System.out.println("Escolheu 3. Eliminar.");
                break;
            case 4:

                break;
            default:
                System.out.println("Opção inválida.");
        }

    }
}
