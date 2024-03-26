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
        nome = input.nextLine();

        System.out.println("Insira Contacto: ");
        contacto = input.nextLine();

        System.out.println("Insira Email: ");
        email = input.nextLine();

        System.out.println("***** Cliente Inserido com Sucesso! *****");
        System.out.println(nome + " | " + contacto + " | " + email);

    }

    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner leitorFicheiro = new Scanner(new File(path));

        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            System.out.println(linha);
        }
    }


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

    public static void procurarEstacionamento(int lugares) {

        System.out.println("Lugares Vagos: ");

        for (int i = 1; i <= lugares; i++) {
            if (i % 5 == 0 && triangular(i)) {
                System.out.println(i);
            }
        }
    }

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

    public static void jogoMaisCaro(String path) throws FileNotFoundException {

        Scanner leitura = new Scanner(new File(path));

        String linha;
        double jogoMaisCaro = 0;
        String nomeJogoMaisCaro = "";

        // Ler linha de cabeçalho
        linha = leitura.nextLine();

        while (leitura.hasNextLine()) {

            // Ler linha do ficheiro para variável "linha"
            linha = leitura.nextLine();

            // Dividir a linha pelo ponto e vírgula ";"
            String[] linhaDividida = linha.split(";");

            // Se a linhaDividida[1] como inteiro MAIOR QUE jogoMaisCaro
            if (Double.parseDouble(linhaDividida[5]) > jogoMaisCaro) {
                // Atualizar variáveis para ficar com as informações da pessoa mais velha atual
                jogoMaisCaro = Double.parseDouble(linhaDividida[5]);
                nomeJogoMaisCaro = linhaDividida[4];
            }
        }

        System.out.println("*** Jogo Mais Caro ***");
        System.out.println("Nome: " + nomeJogoMaisCaro);
        System.out.println("Preço: " + jogoMaisCaro);

    }

    public static void pesquisarCliente(String path) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        Scanner leitura = new Scanner(new File(path));

        String idCliente;

        System.out.println("Insira a ID do Cliente: ");
        idCliente = input.next();

        String linha;

        // Ler linha de cabeçalho
        linha = leitura.nextLine();

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            // Dividir a linha pelo ponto e vírgula ";"
            String[] linhaDividida = linha.split(";");

            if (linhaDividida[0].equals(idCliente)) {

                System.out.println("ID do Cliente: " + idCliente);
                System.out.println("Nome: " + linhaDividida[1]);
                System.out.println("Telemóvel: " + linhaDividida[2]);
                System.out.println("Emai: " + linhaDividida[3]);
            }
        }
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
            String[] campos = linha.split(";");
            editora = campos[2];
            categoria = campos[3];
            jogo = campos[4];

            if (editora.equals(editoraProcurar)) {
                System.out.println("Catálogo Editora: " + editora);
                System.out.println("  Categoria: " + categoria);
                System.out.println("    - " + jogo);
            }
        }
        leitorFicheiro.close();
    }


}
