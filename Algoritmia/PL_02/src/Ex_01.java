import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Introduza um número:");
        n1 = input.nextInt();

        System.out.println("Introduza um número:");
        n2 = input.nextInt();

        if (n1 > n2) {

            System.out.println("Maior: " + n1);
        } else {

            System.out.println("Maior: " + n2);
        }


    }
}
