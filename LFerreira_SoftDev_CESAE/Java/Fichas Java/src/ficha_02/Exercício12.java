package ficha_02;

import java.util.Scanner;

public class Exercício12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.println("Escolha uma opção:");
        opcao = input.nextInt();

        switch (opcao) {
            case 1: System.out.println("Seleccionou opção Criar");
                break;
            case 2: System.out.println("Seleccionou opção Atualizar");
                break;
            case 3: System.out.println("Seleccionou opção Eliminar");
                break;
            case 4:
                break;
            default: System.out.println("Opção Inválida.");
        }

    }
}
