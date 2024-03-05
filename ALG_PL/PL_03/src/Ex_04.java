import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Introduza um número: ");
        n1 = input.nextInt();

        for (n2 = 0; n2<=n1; n2++) {
            System.out.println(n2);
        }

    }
}
