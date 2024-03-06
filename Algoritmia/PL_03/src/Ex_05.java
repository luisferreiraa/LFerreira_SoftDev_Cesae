import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        String mensagem;

        System.out.println("Introduza um número: ");
        n = input.nextInt();

        // Limpeza de buffer
        input.nextLine();

        System.out.println("Introduza uma mensagem: ");
        mensagem = input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println(mensagem);
        }

        /* while (i < n) {

        System.out.println(mensagem);
        i = i + 1

        }
         */


    }
}
