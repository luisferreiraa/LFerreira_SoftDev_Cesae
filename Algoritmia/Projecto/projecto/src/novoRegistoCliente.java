import java.util.Scanner;

public class novoRegistoCliente {

    public static void novoRegistoCliente() {

        Scanner input = new Scanner(System.in);

        String nome;
        String contacto;
        String email;

        System.out.println("***** Inserir Cliente *****");

        System.out.println("Insira Nome:");
        nome = input.nextLine();

        System.out.println("Insira Contacto:");
        contacto = input.nextLine();

        System.out.println("Insira Email:");
        email = input.nextLine();

        System.out.println("***** Cliente Inserido com Sucesso! *****");
        System.out.println(nome + " | " + contacto + " | " + email);

    }
}
