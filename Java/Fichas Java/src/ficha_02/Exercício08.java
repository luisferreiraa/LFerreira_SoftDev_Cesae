package ficha_02;

import java.util.Scanner;

public class Exercício08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Insira nota 1:");
        nota1 = input.nextDouble();

        System.out.println("Insira nota 2:");
        nota2 = input.nextDouble();

        System.out.println("Insira nota 3:");
        nota3 = input.nextDouble();

        media = ((nota1 * 0.25) + (nota2 + 0.35) + (nota3 * 0.40));

        System.out.println("Média Ponderada: " + media);

        if (media >= 9.5) {
            System.out.println("Aprovado! :D");
        } else {
            System.out.println("Reprovado :(");
        }
    }
}
