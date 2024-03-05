package PL_04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolheu a opção 1. Criar");
                    break;
                case 2:
                    System.out.println("Escolheu a opção 2. Atualizar");
                    break;
                case 3:
                    System.out.println("Escolheu a opção 3. Eliminar");
                    break;
                case 4:
                    System.out.println("Escolheu a opção 4. Adeus.");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }
        } while (opcao != 4);
    }
}
