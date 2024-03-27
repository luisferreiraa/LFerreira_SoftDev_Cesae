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

                // Iniciar Scanner
                Scanner leitorFicheiro = new Scanner(new File("Files/GameStart_Admins.csv"));


                // Lê Ficheiro Admins para um vetor
                while (leitorFicheiro.hasNextLine()) {
                    String linha = leitorFicheiro.nextLine();
                    String[] linhaDividida = linha.split(";");

                    // Prosseguir se a password inserida constar da lista
                    if (password.equals(linhaDividida[1])) {
                        System.out.println("Password aceite.");
                        System.out.println();

                        // Menu ADMIN

                        int opcao;

                        do {

                            funcoes.menuAdmin();

                            System.out.println("Escolha uma opção: ");
                            opcao = input.nextInt();

                            switch (opcao) {
                                case 1: // Consulta de Ficheiros

                                    funcoes.menuAdminLerFicheiros();
                                    break;

                                case 2:

                                    // Função Total de Vendas

                                    double total = funcoes.totalVendas("Files/GameStart_Vendas.csv");
                                    int numeroVendas = funcoes.contarNumeroVendas("Files/GameStart_Vendas.csv");

                                    System.out.println("**** Número Total de Vendas ****");
                                    System.out.println(numeroVendas);
                                    System.out.println("**** Valor Total de Vendas **** ");
                                    System.out.println(total + " € ");
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

                                    funcoes.jogoMaisCaro("Files/GameStart_Vendas.csv", "Files/GameStart_Clientes.csv");
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

                                case 11: // Sair
                                    // Função Imprimir Ficheiro (copyright)

                                    funcoes.imprimirFicheiro("Files/GameStart_Copyright.txt");
                                    break;

                                default:
                                    System.out.println("Opção inválida.");

                            }
                        }
                        while (opcao < 11);
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

                    funcoes.menuCliente();

                    System.out.println("**** Escolha uma opção **** ");
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
                            funcoes.imprimirCatalogoCategoria("Files/GameStart_Vendas.csv");
                            break;

                        case 7:

                            // Função imprimir jogo mais recente
                            break;

                        case 8: // Sair

                            // Função imprimirFicheiro(copyright)
                            funcoes.imprimirFicheiro("Files/GameStart_Copyright.txt");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                }
                while (opcao < 8);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não foi encontrado.");
        }
    }
}

