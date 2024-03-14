package Ficha_01;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min1, min2, min3, seg1, seg2, seg3, somaMinutos, somaSegundos, minParaSegundos, totalSegundos, tHoras, minRest, segRest;

        System.out.println("Introduza minutos da música 1: ");
        min1 = input.nextInt();

        System.out.println("Introduza segundos da música 1: ");
        seg1 = input.nextInt();

        System.out.println("Introduza minutos da música 2: ");
        min2 = input.nextInt();

        System.out.println("Introduza segundos da música 2: ");
        seg2 = input.nextInt();

        System.out.println("Introduza minutos da música 3: ");
        min3 = input.nextInt();

        System.out.println("Introduza segundos da música 3: ");
        seg3 = input.nextInt();

        somaMinutos = min1 + min2 + min3;

        minParaSegundos = somaMinutos * 60;

        somaSegundos = seg1 + seg2 + seg3;

        totalSegundos = minParaSegundos + somaSegundos;

        tHoras = (totalSegundos / 3600);
        minRest = (totalSegundos % 3600 / 60);
        segRest = totalSegundos % 60;

        System.out.println(tHoras + "h " + minRest + "m " + segRest + "s");


    }
}
