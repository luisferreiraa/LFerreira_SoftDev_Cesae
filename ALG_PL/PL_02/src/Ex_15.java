import java.util.Scanner;

public class Ex_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3, aux1, aux2, aux3;
        String opcao;

        System.out.println("Introduz um número:");
        n1 = input.nextInt();

        System.out.println("Introduz um número:");
        n2 = input.nextInt();

        System.out.println("Introduz um número:");
        n3 = input.nextInt();

        System.out.println("Ordem crescente (c) ou ordem decrescente (d)?");
        opcao = input.next();

        switch (opcao) {
            case "c":
                if (n1 > n2) {

                    aux1 = n1;
                    n1 = n2;
                    n2 = aux1;
                }

                if (n2 > n3) {
                    aux2 = n2;
                    n2 = n3;
                    n3 = aux2;
                }

                if (n1 > n2) {
                    aux3 = n1;
                    n1 = n2;
                    n2 = aux3;
                }

                System.out.println("Números por ordem crescente: " + n1 + " " + n2 + " " + n3);
                break;
            case "d":
                if (n1 < n2) {

                    aux1 = n1;
                    n1 = n2;
                    n2 = aux1;
                }

                if (n2 < n3) {
                    aux2 = n2;
                    n2 = n3;
                    n3 = aux2;
                }

                if (n1 < n2) {
                    aux3 = n1;
                    n1 = n2;
                    n2 = aux3;
                }
                System.out.println("Números por ordem decrescente: " + n1 + " " + n2 + " " + n3);
                break;
        }
    }
}
