package ficha_01;

import java.util.Scanner;

public class Exercício05 {

public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    double valor1, valor2, valor3;

    System.out.println("Introduza valor 1");
    valor1 = input.nextDouble();

    System.out.println("Introduza valor 2");
    valor2 = input.nextDouble();

    System.out.println("Introduza valor 3");
    valor3 = input.nextDouble();

    System.out.println("\nMédia aritmética: " + (valor1+valor2+valor3)/3);

    System.out.println("Média ponderada: " + valor1*0.2+valor2*0.3+valor3*0.5);





        }
}
