import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, total, desconto;

        System.out.println("Introduza preço produto 1: ");
        preco1 = input.nextDouble();

        System.out.println("Introduza preço produto 2: ");
        preco2 = input.nextDouble();

        System.out.println("Introduza preço produto 3: ");
        preco3 = input.nextDouble();

        total = preco1 + preco2 + preco3;
        desconto = total * 0.10;

        System.out.println("Desconto 10%: " + desconto + "€");
        System.out.println("Preço total com desconto: " + (total - desconto) + "€");
    }
}
