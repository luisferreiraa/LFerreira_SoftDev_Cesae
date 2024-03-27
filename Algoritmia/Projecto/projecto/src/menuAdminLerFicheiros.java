import java.io.FileNotFoundException;
import java.util.Scanner;

public class menuAdminLerFicheiros {

    public static void menuAdminLerFicheiros() {

        try {

            Scanner input = new Scanner(System.in);
            int escolha;

            System.out.println("1. Consultar Vendas");
            System.out.println("2. Consultar Clientes");
            System.out.println("3. Consultar Categorias");

            do {

                System.out.println("Escolha uma opção: ");
                escolha = input.nextInt();

                // Imprimir Ficheiro Vendas
                if (escolha == 1) {
                    funcoes.imprimirFicheiro("Files/GameStart_Vendas.csv");
                }

                // Imprimir Ficheiro Clientes
                if (escolha == 2) {
                    funcoes.imprimirFicheiro("Files/GameStart_Clientes.csv");
                }

                // Imprimir Ficheiro Categorias
                if (escolha == 3) {
                    funcoes.imprimirFicheiro("Files/GameStart_Categorias.csv");
                }

            } while (escolha != 0);

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }
    }
}
