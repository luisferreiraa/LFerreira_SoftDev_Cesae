package ficha_01;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, desconto;

        System.out.println("Introduza preço 1");
        preco1= input.nextInt();

        System.out.println("Introduza preço 2");
        preco2= input.nextInt();

        System.out.println("Introduza preço 3");
        preco3= input.nextInt();

        desconto = ((preco1+preco2+preco3)*0.10);
        System.out.println("Desconto 10%: " + desconto);
        System.out.println("Valor a pagar: " + ((preco1+preco2+preco3)-desconto));


    }
}
