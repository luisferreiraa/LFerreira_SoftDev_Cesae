import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws FileNotFoundException {

        try {

            Scanner input = new Scanner(System.in);

            String opcaoInicial;

            // Perguntar ao utilizador se é ADMIN ou CLIENTE
            System.out.println("***** GameStart v1.0 *****");
            System.out.println("ADMIN ou CLIENTE?");
            opcaoInicial = input.nextLine();

            // Se é ADMIN:
            if (opcaoInicial.equalsIgnoreCase("ADMIN")) {

                // Pedir password
                System.out.println("PASSWORD: ");
                String password = input.nextLine();

                // Ler ficheiro "Admins" para um vetor
                Scanner leitorFicheiro = new Scanner(new File("Files/GameStart_Admins.csv"));


                // Lê Ficheiro Admins para um vetor
                while (leitorFicheiro.hasNextLine()) {
                    String linha = leitorFicheiro.nextLine();
                    String[] linhaDividida = linha.split(";");

                    // Prosseguir se a password inserida constar da lista
                    if (password.equals(linhaDividida[1])) {
                        System.out.println("Password aceite.");

                        // Menu ADMIN

                        int opcao;

                        do {

                            System.out.println("1. Consulta de Ficheiros");
                            System.out.println("2. Total de Vendas");
                            System.out.println("3. Total de Lucro");
                            System.out.println("4. Pesquisa de Cliente");
                            System.out.println("5. Jogo Mais Caro");
                            System.out.println("6. Melhores Clientes");
                            System.out.println("7. Melhor Categoria");
                            System.out.println("8. Pesquisa de Vendas");
                            System.out.println("9. Top 5 Jogos");
                            System.out.println("10. Bottom 5 Jogos");

                            System.out.println("Escolha uma opção: ");
                            opcao = input.nextInt();

                            switch (opcao) {
                                case 1: // Consulta de Ficheiros - [converter em função]

                                    int escolha;

                                    do {

                                        System.out.println("1. Consultar Vendas");
                                        System.out.println("2. Consultar Clientes");
                                        System.out.println("3. Consultar Categorias");

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
                                    break;

                                case 2:

                                    // Função Total de Vendas
                                    double total = funcoes.totalVendas("Files/GameStart_Vendas.csv");
                                    int numeroVendas = funcoes.contarNumeroVendas("Files/GameStart_Vendas.csv");

                                    System.out.println("Número Total de Vendas: " + numeroVendas);
                                    System.out.println("Valor Total de Vendas: " + total + " €");
                                    break;

                                case 3:

                                    // Função Total de Lucro
                                    break;

                                case 4:

                                    // Função Pesquisa de Cliente
                                    funcoes.pesquisarCliente("Files/GameStart_Clientes.csv");

                                    break;
                                case 5:

                                    // Função Jogo Mais Caro
                                    funcoes.jogoMaisCaro("Files/GameStart_Vendas.csv");

                                    break;
                                case 6:

                                    // Função Melhores Clientes
                                    break;

                                case 7:

                                    // Função Melhor Categoria
                                    break;
                                case 8:
                                    // Função Pesquisa de Vendas
                                    funcoes.pesquisarVendas("Files/GameStart_Vendas.csv");
                                    break;

                                case 9:

                                    // Função Top 5 Jogos
                                    break;

                                case 10:

                                    // Função Bottom 5 Jogos
                                    break;

                                default:
                                    System.out.println("Opção inválida.");
                            }
                        }
                        while (opcao != 10);
                    }
                }
                // Informar caso a password estiver incorrecta
                System.out.println("Password incorreta.");
            }

            // Se é CLIENTE:
            if (opcaoInicial.equalsIgnoreCase("CLIENTE")) {

                // Menu CLIENTE
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
                            int lugares = 121;
                            funcoes.procurarEstacionamento(lugares);
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
                            funcoes.imprimirCatalogoEditora("Files/GameStart_Vendas.csv");
                            break;

                        case 6:

                            // Função imprimir catálogo categoria
                            break;

                        case 7:

                            // Função imprimir jogo mais recente
                            break;

                        case 8:

                            // Função imprimirFicheiro(copyright)
                            funcoes.imprimirFicheiro("Files/GameStart_Copyright.txt");
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

