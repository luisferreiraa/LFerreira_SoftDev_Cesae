import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoes {

// Funções ADMIN


    public static void menuAdmin() {

        System.out.println("**** Menu Admin ****");
        System.out.println();

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
        System.out.println("11. Sair");

    }

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

        }catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }
    }

    /**
     * Contabilizar o valor total de vendas
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static double totalVendas(String path) throws FileNotFoundException {

        double valorTotal = 0;

        Scanner leitura = new Scanner(new File(path));

        String linha = leitura.nextLine();

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            String[] linhaDividida = linha.split(";");

            double totalLinhaAtual = Double.parseDouble(linhaDividida[5]);

            valorTotal += totalLinhaAtual;

        }

        return valorTotal;

    }

    public static void pesquisarVendas(String path) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        Scanner leitura = new Scanner(new File(path));
        String linha;

        String nomeJogo;

        System.out.println("Insira o Jogo a Pesquisar: ");
        nomeJogo = input.nextLine();

        // Ler linha de cabeçalho
        linha = leitura.nextLine();

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            // Dividir a linha pelo ponto e vírgula ";"
            String[] linhaDividida = linha.split(";");

            if (linhaDividida[4].equals(nomeJogo)) {

                System.out.println("Nome do Jogo: " + linhaDividida[4]);
                System.out.println("Clientes que Compraram: " + linhaDividida[1]);
            }

        }
        leitura.close();
    }

    /**
     * Contabilizar o número total de vendas
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static int contarNumeroVendas(String path) throws FileNotFoundException {

        Scanner leitura = new Scanner(new File(path));

        String linha = leitura.nextLine();

        int numeroVendas = 0;

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            numeroVendas++;

        }
        return numeroVendas;
    }

    /**
     * Pesquisa cliente inserido pelo utilizador e imprime os detalhes do mesmo
     *
     * @param path
     * @throws FileNotFoundException
     */
    public static void pesquisarCliente(String path) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        Scanner leitura = new Scanner(new File(path));

        String idCliente;

        System.out.println("**** Insira a ID do Cliente ****");
        idCliente = input.next();

        String linha;

        // Ler linha de cabeçalho
        linha = leitura.nextLine();

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            // Dividir a linha pelo ponto e vírgula ";"
            String[] linhaDividida = linha.split(";");

            if (linhaDividida[0].equals(idCliente)) {

                System.out.println("___ ID do Cliente: " + idCliente);
                System.out.println("___ Nome: " + linhaDividida[1]);
                System.out.println("___ Telemóvel: " + linhaDividida[2]);
                System.out.println("___ Emai: " + linhaDividida[3]);
            }
        }
    }

    /**
     * Define qual o jogo mais caro e quem foi o cliente que o comprou
     *
     * @param path1, path2
     * @throws FileNotFoundException
     */
    public static void jogoMaisCaro(String path1, String path2) throws FileNotFoundException {

        // Ler ficheiro Vendas
        Scanner leituraVendas = new Scanner(new File(path1));

        String linha;
        double jogoMaisCaro = 0;
        String nomeJogoMaisCaro = "";
        String idComprou = "";
        String nomeComprou = "";

        // Ler linha de cabeçalho
        linha = leituraVendas.nextLine();

        while (leituraVendas.hasNextLine()) {

            // Ler linha do ficheiro para variável "linha"
            linha = leituraVendas.nextLine();

            // Dividir a linha pelo ponto e vírgula ";"
            String[] linhaDividida = linha.split(";");

            // Se a linhaDividida[1] como inteiro MAIOR QUE jogoMaisCaro
            if (Double.parseDouble(linhaDividida[5]) > jogoMaisCaro) {
                // Atualizar variáveis para ficar com as informações do jogo mais caro
                jogoMaisCaro = Double.parseDouble(linhaDividida[5]);
                nomeJogoMaisCaro = linhaDividida[4];
                idComprou = linhaDividida[1];
            }

        }

        // Ler ficheiro Clientes
        Scanner leituraClientes = new Scanner(new File(path2));

        linha = leituraClientes.nextLine();

        while (leituraClientes.hasNextLine()) {

            // Ler linha do ficheiro para variável "linha"
            linha = leituraClientes.nextLine();

            // Dividir a linha pelo ponto e vírgula ";"
            String[] linhaDividida = linha.split(";");

                if (linhaDividida[0].equals(idComprou)) {
                    idComprou = linhaDividida[1];
                }
        }

        System.out.println("**** Jogo Mais Caro ****");
        System.out.println("Nome: " + nomeJogoMaisCaro);
        System.out.println("Preço: " + jogoMaisCaro);
        System.out.println("ID Cliente: " + idComprou);

    }


    // Funções CLIENTE


    public static void menuCliente() {

        System.out.println("**** Menu Cliente ****");
        System.out.println();

        System.out.println("1. Novo Registo");
        System.out.println("2. Procurar Estacionamento");
        System.out.println("3. Catálogo");
        System.out.println("4. Catálogos Gráficos");
        System.out.println("5. Catálogo Editora");
        System.out.println("6. Catálogo Categoria");
        System.out.println("7. Jogo Mais Recente");
        System.out.println("8. Sair");

    }

    /**
     * Introduzir e imprimir os dados de um novo cliente
     */
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

    /**
     * Imprimir CatalogoGrafico
     *
     * @throws FileNotFoundException
     */
    public static void imprimirGraficos() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int escolha;

        do {

            System.out.println("1. Call Of Duty");
            System.out.println("2. FIFA");
            System.out.println("3. Hollow Knight");
            System.out.println("4. Minecraft");
            System.out.println("5. Mortal Kombat");
            System.out.println("6. Overcooked");
            System.out.println("7. Witcher 3");

            System.out.println("Escolha o Catálogo Gráfico: ");
            escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    funcoes.imprimirFicheiro("Files/CatalogoGrafico/callOfDuty.txt");
                    break;
                case 2:
                    funcoes.imprimirFicheiro("Files/CatalogoGrafico/fifa.txt");
                    break;
                case 3:
                    funcoes.imprimirFicheiro("Files/CatalogoGrafico/hollowKnight.txt");
                    break;
                case 4:
                    funcoes.imprimirFicheiro("Files/CatalogoGrafico/minecraft.txt");
                    break;
                case 5:
                    funcoes.imprimirFicheiro("Files/CatalogoGrafico/mortalKombat.txt");
                    break;
                case 6:
                    funcoes.imprimirFicheiro("Files/CatalogoGrafico/overcooked.txt");
                    break;
                case 7:
                    funcoes.imprimirFicheiro("Files/CatalogoGrafico/witcher3.txt");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (escolha != 0);
    }

    /**
     * Define se um número é triangular
     *
     * @param num
     * @return
     */
    public static boolean triangular(int num) {

        int somatorio = 0;

        for (int i = 1; somatorio < num; i++) {

            somatorio = somatorio + i;

            if (somatorio == num) {
                return true;
            }
        }

        return false;

    }

    /**
     * Verificar se um lugar está vago (triangular, multiplo de 5)
     *
     * @param lugares
     */
    public static void procurarEstacionamento(int lugares) {

        System.out.println("**** Lugares Vagos ****");

        for (int i = 1; i <= lugares; i++) {
            if (i % 5 == 0 && triangular(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Imprime catálogo da editora
     *
     * @param path
     * @throws FileNotFoundException
     */
    public static void imprimirCatalogoEditora(String path) throws FileNotFoundException {

        String editora = ""; // [2]
        String categoria = ""; // [3]
        String jogo = ""; // [4]
        String editoraProcurar;

        Scanner leitorFicheiro = new Scanner(new File(path));
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a Editora a Procurar: ");
        editoraProcurar = input.nextLine();

        // Ler linha de cabeçalho
        String linha = leitorFicheiro.nextLine();

        while (leitorFicheiro.hasNextLine()) {

            linha = leitorFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");
            editora = linhaDividida[2];
            categoria = linhaDividida[3];
            jogo = linhaDividida[4];

            if (editora.equals(editoraProcurar)) {
                System.out.println("**** " + editora + " ****");
                System.out.println("___ " + categoria + " ___");
                System.out.println(jogo);
            }
        }

    }

    /**
     * Imprime catálogo de uma categoria inserida pelo utilizador
     * @param path
     * @throws FileNotFoundException
     */
    public static void imprimirCatalogoCategoria(String path) throws FileNotFoundException {

        String categoria = ""; // [3]
        String jogo = ""; // [4]
        String valor = ""; // [5]
        String categoriaProcurar;

        Scanner leitorFicheiro = new Scanner(new File(path));
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a Categoria a Procurar: ");
        categoriaProcurar = input.nextLine();

        // Ler linha de cabeçalho
        String linha = leitorFicheiro.nextLine();

        while (leitorFicheiro.hasNextLine()) {

            linha = leitorFicheiro.nextLine();

            String[] linhaDividida = linha.split(";");

            categoria = linhaDividida[3];
            jogo = linhaDividida[4];
            valor = linhaDividida[5];

            if (categoria.equals(categoriaProcurar)) {
                System.out.println("**** " + categoria + " ****");
                System.out.println(jogo + " " + valor + "€");
            }
        }
    }

    public static void imprimirJogoMaisRecente(String path) throws FileNotFoundException {

        Scanner leitorFicheiro = new Scanner(new File(path));

        // Ler linha do cabeçalho
        String linha = leitorFicheiro.nextLine();

        while (leitorFicheiro.hasNextLine()) {

            linha = leitorFicheiro.nextLine();

            String[] linhaDividida = linha.split(";");

            for (int i=0; i < linhaDividida.length; i++) {

            }

        }
    }

    /*
    public static void lerFicheiroParaMatriz(String path) throws FileNotFoundException {

        Scanner leitorFicheiro = new Scanner(new File(path));

        int colunas = ;
        int linhas = ;

        String[][] linha = new String[linhas][colunas];

        while (leitorFicheiro.hasNextLine()) {
            for (int i = 0; i < linha.length; i++) {
                String[] linhaVendas = leitorFicheiro.nextLine().split(";");
                for (int j = 0; j < linhaVendas.length; j++) {
                    linha[i][j] = linhaVendas[j];
                }
            }
        }


     */


    // Funções GERAIS


    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner leitorFicheiro = new Scanner(new File(path));

        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            System.out.println(linha);
        }
    }

    /**
     * Conta o número de colunas de um ficheiro
     *
     * @param path
     * @param delimitador
     * @return numeroColunas de um vetor
     * @throws FileNotFoundException
     */
    public static int contarColunas(String path, String delimitador) throws FileNotFoundException {

        Scanner leitura = new Scanner(new File(path));

        String linha = leitura.nextLine();

        String[] linhaDividida = linha.split(delimitador);

        int numeroColunas = linhaDividida.length;

        return numeroColunas;
    }

    /**
     * Conta o número de linhas de um ficheiro
     *
     * @param path
     * @return Número de linhas
     * @throws FileNotFoundException
     */
    public static int contarLinhasFicheiro(String path) throws FileNotFoundException {

        int numeroLinhas = 0;

        Scanner leitura = new Scanner(new File(path));

        while (leitura.hasNextLine()) {
            numeroLinhas++;
            leitura.nextLine();
        }

        return numeroLinhas;

    }

    /**
     * Lê um ficheiro para dentro de uma matriz
     *
     * @param path
     * @return Matriz
     * @throws FileNotFoundException
     */
    public static String[][] lerFicheiroParaMatriz(String path) throws FileNotFoundException {

        // Declarar matriz à medida
        String[][] matrizCompleta = new String[contarLinhasFicheiro(path) - 1][contarColunas(path, ";")];

        // Scanner
        Scanner leitura = new Scanner(new File(path));

        // Linha atual
        String linha = leitura.nextLine();

        int contadorLinha = 0;

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            String[] linhaDividida = linha.split(",");

            for (int i = 0; i < matrizCompleta[0].length; i++) {
                matrizCompleta[contadorLinha][i] = linhaDividida[i];
            }

            contadorLinha++;

        }

        return matrizCompleta;

    }

}
