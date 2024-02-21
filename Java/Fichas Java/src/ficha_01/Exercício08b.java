package ficha_01;

import java.util.Scanner;

public class Exercício08b {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minMusica1, minMusica2, minMusica3, minMusica4, minMusica5, segMusica1, segMusica2, segMusica3, segMusica4, segMusica5, somaMin, somaSeg, durTotalSeg, durTotalHoras, minRest, segRest;

        System.out.println("Introduza minutos da música 1");
        minMusica1 = input.nextInt();

        System.out.println("Introduza segundos da música 1");
        segMusica1 = input.nextInt();

        System.out.println("Introduza minutos da música 2");
        minMusica2 = input.nextInt();

        System.out.println("Introduza segundos da música 2");
        segMusica2 = input.nextInt();

        System.out.println("Introduza minutos da música 3");
        minMusica3 = input.nextInt();

        System.out.println("Introduza segundos da música 3");
        segMusica3 = input.nextInt();

        System.out.println("Introduza minutos da música 4");
        minMusica4 = input.nextInt();

        System.out.println("Introduza segundos da música 4");
        segMusica4 = input.nextInt();

        System.out.println("Introduza minutos da música 5");
        minMusica5 = input.nextInt();

        System.out.println("Introduza segundos da música 5");
        segMusica5 = input.nextInt();

        somaMin = minMusica1 + minMusica2 + minMusica3 + minMusica4 + minMusica5;

        somaSeg = segMusica1 + segMusica2 + segMusica3 + segMusica4 + segMusica5;

        durTotalSeg = somaMin * 60 + somaSeg;

        durTotalHoras = durTotalSeg / 3600;

        minRest = (durTotalSeg % 3600) / 60;

        segRest = durTotalSeg % 60;

        System.out.print(durTotalHoras + "h ");
        System.out.print(minRest + "m ");
        System.out.print(segRest + "s ");


    }
}
