package ficha_02;

import java.util.Scanner;

public class Exercício13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos, horasFinal;

        System.out.println("Introduza as horas:");
        horas = input.nextInt();

        System.out.println("Introduza os minutos:");
        minutos = input.nextInt();

        if (horas > 12) {
            horasFinal = horas - 12;
            System.out.println(horasFinal + " " + minutos + " PM");
        } else {
            System.out.println(horas + " " + minutos + " AM");
        }


    }
}
