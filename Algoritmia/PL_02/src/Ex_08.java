import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Introduza nota 1:");
        nota1 = input.nextDouble();

        System.out.println("Introduza nota 2:");
        nota2 = input.nextDouble();

        System.out.println("Introduza nota 3:");
        nota3 = input.nextDouble();

        media = (nota1*0.25) + (nota2*0.35) + (nota3*0.40);
        System.out.println(media);

        if (media > 9.5) {

            System.out.println("Está aprovado!");
        } else {

            System.out.println("Reprovado.");
        }
    }
}
