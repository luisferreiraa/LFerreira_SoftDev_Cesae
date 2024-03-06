import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Introduza um número: ");
        n1 = input.nextInt();

        System.out.println("Introduza um número: ");
        n2 = input.nextInt();

        if (n1 < n2) {

            System.out.print(n1 + " " + n2);
        } else if (n2 < n1) {

            System.out.println(n2 + " " + n1);

        }

    }
}
