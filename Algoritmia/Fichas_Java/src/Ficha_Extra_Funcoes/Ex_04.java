package Ficha_Extra_Funcoes;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Insira um número para imprimir a sua tabuada: ");
        num = input.nextInt();

        funcoes.imprimirTabuada(num);

    }
}
