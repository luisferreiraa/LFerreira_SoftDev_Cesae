import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int num = 1; num <= 10; num++) {

            System.out.println("Tabuada do " + num + ":");

            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

                int resultado = num * multiplicador;

                System.out.println(num + " x " + multiplicador + " = " + resultado);
            }
            System.out.println();
        }

    }
}
