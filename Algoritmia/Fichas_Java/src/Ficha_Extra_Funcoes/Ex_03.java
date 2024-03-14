package Ficha_Extra_Funcoes;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int altura;
        int largura;
        double area;

        System.out.println("Introduza a altura do retângulo: ");
        altura = input.nextInt();

        System.out.println("Introduza a largura do retângulo: ");
        largura = input.nextInt();

        area = funcoes.calcularAreaRetangulo(altura,largura);
        System.out.println("Área do retângulo: " + area);

    }
}
