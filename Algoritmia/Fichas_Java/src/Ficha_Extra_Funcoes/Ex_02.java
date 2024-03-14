package Ficha_Extra_Funcoes;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3;
        double media;

        System.out.println("Introduza um número: ");
        num1 = input.nextDouble();

        System.out.println("Introduza um número: ");
        num2 = input.nextDouble();

        System.out.println("Introduza um número: ");
        num3 = input.nextDouble();

        media = funcoes.media(num1,num2,num3);
        System.out.println("Média: " + media);
    }
}
