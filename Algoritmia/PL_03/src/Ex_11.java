import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limite, salto, i;

        System.out.println("Introduza um valor limite: ");
        limite = input.nextInt();

        System.out.println("Introduza um valor de salto: ");
        salto = input.nextInt();

        for (i = 0; i <= limite; i += salto) {

            System.out.println(i);
        }


    }
}
