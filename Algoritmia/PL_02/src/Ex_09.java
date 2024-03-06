import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Introduza um numero:");
        n1 = input.nextInt();

        System.out.println("Introduza um numero:");
        n2 = input.nextInt();

        System.out.println("Introduza um numero:");
        n3 = input.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("Menor: " + n1);
        }
        if (n2 < n1 && n2 < n3) {
            System.out.println("Menor: " + n2);
        }
        if (n3 < n1 && n3 < n2) {
            System.out.println("Menor: " + n3);
        }
    }
}
