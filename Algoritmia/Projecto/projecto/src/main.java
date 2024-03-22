import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            Scanner input = new Scanner(System.in);

            String opcaoInicial;

            System.out.println("***** GameStart v1.0 *****");
            System.out.println("ADMIN ou CLIENTE?");
            opcaoInicial = input.nextLine();

            if (opcaoInicial.equalsIgnoreCase("ADMIN")) {

            }

            if (opcaoInicial.equalsIgnoreCase("CLIENTE")) {

                int opcao;

                do {

                    System.out.println("1. Novo Registo");
                    System.out.println("2. Procurar Estacionamento");
                    System.out.println("3. Catálogo");
                    System.out.println("4. Catálogos Gráficos");
                    System.out.println("5. Catálogo Editora");
                    System.out.println("6. Catálogo Categoria");
                    System.out.println("7. Jogo Mais Recente");
                    System.out.println("8. Sair");


                    System.out.println("Escolha uma opção: ");
                    opcao = input.nextInt();

                    switch (opcao) {

                        case 1:
                            // Função novo registo
                            funcoes.novoRegistoCliente();
                            break;
                        case 2:
                            // Função procurar estacionamento
                            break;
                        case 3:
                            // Função imprimir catálogo
                            break;
                        case 4:
                            // Função imprimir catálogos gráficos
                            funcoes.imprimirGraficos();
                            break;
                        case 5:
                            // Função imprimir catálogo editora
                            break;
                        case 6:
                            // Função imprimir catálogo categoria
                            break;
                        case 7:
                            // Função imprimir jogo mais recente
                            break;
                        case 8:
                            // Função imprimir copyright
                            funcoes.imprimirCopyright("Files/GameStart_Copyright.txt");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                }
                while (opcao != 8);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não foi encontrado.");
        }
    }
}

