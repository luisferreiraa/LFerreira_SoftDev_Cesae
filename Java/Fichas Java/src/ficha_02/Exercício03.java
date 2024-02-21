package ficha_02;

import java.util.Scanner;

public class Exercício03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salario;

        System.out.println("Insira o seu salário:");
        salario = input.nextInt();

        if (salario <= 15000) {
            System.out.println("Paga taxa de 20%: " + salario * 0.20 + "€");
        }
        if (salario >= 15000 && salario <= 20000) {
            System.out.println("Paga taxa de 30%: " + salario * 0.30 + "€");
        }
        if (salario > 20000 && salario <= 25000) {
            System.out.println("Paga taxa de 35%: " + salario * 0.35 + "€");
        }
        if (salario > 25000) {
            System.out.println("Paga taxa de 40%: " + salario * 0.40 + "€");
        }


    }
}
