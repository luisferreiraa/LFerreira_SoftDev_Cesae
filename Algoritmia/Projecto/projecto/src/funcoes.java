import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoes {

    public static void novoRegistoCliente() {

        Scanner input = new Scanner(System.in);

        String nome;
        String contacto;
        String email;

        System.out.println("***** Inserir Cliente *****");

        System.out.println("Insira Nome: ");
        nome = input.next();

        System.out.println("Insira Contacto: ");
        contacto = input.next();

        System.out.println("Insira Email: ");
        email = input.next();

        System.out.println("***** Cliente Inserido com Sucesso! *****");
        System.out.println(nome + " | " + contacto + " | " + email);

    }

    public static void imprimirCopyright(String path) throws FileNotFoundException {

        Scanner leitorFicheiro = new Scanner(new File(path));

        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            System.out.println(linha);
        }
    }


    public static void imprimirGraficos(String path) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("1. Call of Duty");
            System.out.println("2. FIFA");
            System.out.println("3. Hollow Knight");
            System.out.println("4. Minecraft");
            System.out.println("5. Mortal Kombat");
            System.out.println("6. Overcooked");
            System.out.println("7. Witcher 3");
            System.out.println("8. Voltar atrás");

            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

        }

        while (opcao != 8);

    }
}
