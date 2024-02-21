package ficha_02;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salario;

        System.out.println("Insira um salário:");
        salario = input.nextInt();

        if (salario <= 15000) {
            System.out.println("Paga taxa de 20%: " + salario * 0.20 + "€");
        } else {
            System.out.println("Paga taxa de 30%: " + salario * 0.30 + "€");
        }
    }
}
