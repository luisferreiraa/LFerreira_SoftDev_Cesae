package Ficha_Extra_Ciclos;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int num = 0; num <= 255; num = num + 3) {
            System.out.println(num);
        }
    }
}
