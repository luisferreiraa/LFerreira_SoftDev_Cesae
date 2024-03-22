package funcoes;

import java.util.Scanner;

public class novoRegistoCliente {

    public static void novoRegistoCliente() {

        Scanner input = new Scanner(System.in);

        String nome;
        int contacto;
        String email;

        System.out.println("***** Inserir Cliente *****");

        System.out.print("Insira Nome: ");
        nome = input.next();

        System.out.print("Insira Contacto: ");
        contacto = input.nextInt();

        System.out.println("Insira Email: ");
        email = input.next();

        System.out.println("Cliente Inserido com Sucesso: " + nome + " | " + contacto + " | " + email);

    }
}
