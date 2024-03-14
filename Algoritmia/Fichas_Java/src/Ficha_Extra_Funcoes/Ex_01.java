package Ficha_Extra_Funcoes;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        int menor;

        System.out.println("Introduza um número: ");
        num1 = input.nextInt();

        System.out.println("Introduza um número: ");
        num2 = input.nextInt();

        System.out.println("Introduza um número: ");
        num3 = input.nextInt();

        menor = funcoes.numeroMaisPequeno(num1,num2,num3);
        System.out.println("Menor: " + menor);






    }
}
