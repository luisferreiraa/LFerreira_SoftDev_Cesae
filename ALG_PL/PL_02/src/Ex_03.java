import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salario;

        System.out.println("Introduza um salario:");
        salario = input.nextInt();

        if (salario <= 15000) {

            System.out.println("Paga taxa de 20%: " + (salario * 0.20));
        }
        if (salario > 15000 && salario <= 20000) {

            System.out.println("Paga taxa de 30%: " + (salario * 0.30));

        }
        if (salario > 20000 && salario <= 25000) {

            System.out.println("Paga taxa de 35%: " + (salario * 0.35));
        } else {

            System.out.println("Paga taxa de 40%: " + (salario * 0.40));
        }
    }
}
