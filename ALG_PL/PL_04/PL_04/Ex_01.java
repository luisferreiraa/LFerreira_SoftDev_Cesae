package PL_04;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, operacao, resultado;
        String continuar;

        System.out.println("Introduza valor 1: ");
        valor1 = input.nextInt();

        System.out.println("Introduza valor 2: ");
        valor2 = input.nextInt();


            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");

            System.out.println("Seleccione uma operação: ");
            operacao = input.nextInt();

        do {

            switch (operacao) {
                case 1:
                    resultado = valor1 + valor2;
                    System.out.println(valor1 + " + " + valor2 + " = " + resultado);
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    System.out.println(valor1 + " - " + valor2 + " = " + resultado);
                    break;
                case 3:
                    resultado = valor1 * valor2;
                    System.out.println(valor1 + " * " + valor2 + " = " + resultado);
                    break;
                case 4:
                    resultado = valor1 / valor2;
                    System.out.println(valor1 + " / " + valor2 + " = " + resultado);
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

            System.out.println("Deseja continuar? (introduza s/n) ");
            continuar = input.nextLine();
/*

        } while ();


    }
    */
 */
}
