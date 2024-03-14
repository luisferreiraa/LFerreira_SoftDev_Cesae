package Ficha_01;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double id, dias, vIliquido, subAlim, retIRS, retSS;

        System.out.println("Introduza o seu id: ");
        id = input.nextInt();

        System.out.println("Introduza os dias de trabalho: ");
        dias = input.nextInt();

        System.out.println("Id: " + id);

        vIliquido = dias*40;
        System.out.println("Valor Iliquido: " + vIliquido);

        subAlim = dias*5;
        System.out.println("Subsidio de Alimentação: " + subAlim);

        retIRS = ((dias*40)*0.10);
        System.out.println("Retenção de IRS: " + retIRS);

        retSS = ((dias*40)-((dias*40)*0.3475));
        System.out.println("Retenção Segurança Social: " + retSS);

        System.out.println("Valor liquido a receber: " + (vIliquido - (retIRS+retSS)));



    }
}
