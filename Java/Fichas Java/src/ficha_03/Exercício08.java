package ficha_03;

import java.util.Scanner;

public class Exercício08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1;

        System.out.println("Introduza um número:");
        n1 = input.nextInt();

        for (int aux = n1 - 5; aux < n1; aux++) {
            if (aux >= 0) {
                System.out.println(aux);
            }
        }

       for (int aux = n1+1; aux <= n1+5; aux++) {
           System.out.println(aux);
       }
    }
}
