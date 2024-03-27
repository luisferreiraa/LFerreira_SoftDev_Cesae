import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class jogoMaisCaro {

    /* public static void jogoMaisCaro(String path1, String path2) throws FileNotFoundException {

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

     */

    public static void jogoMaisCaro(String path1, String path2) throws FileNotFoundException {

        // Ler ficheiro Vendas
        Scanner leituraVendas = new Scanner(new File(path1));

        String linha;
        double jogoMaisCaro = 0;
        String nomeJogoMaisCaro = "";
        String idsClientesJogoMaisCaro = ""; // String para armazenar IDs dos clientes que compraram o jogo mais caro

        // Ler linha de cabeçalho
        linha = leituraVendas.nextLine();

        while (leituraVendas.hasNextLine()) {

            // Ler linha do ficheiro para variável "linha"
            linha = leituraVendas.nextLine();

            // Dividir a linha pelo ponto e vírgula ";"
            String[] linhaDividida = linha.split(";");

            // Se a linhaDividida[5] como double MAIOR QUE jogoMaisCaro
            if (Double.parseDouble(linhaDividida[5]) > jogoMaisCaro) {

                // Atualizar variáveis para ficar com as informações do jogo mais caro
                jogoMaisCaro = Double.parseDouble(linhaDividida[5]);
                nomeJogoMaisCaro = linhaDividida[4];
                idsClientesJogoMaisCaro = linhaDividida[1]; // Atribuir o ID do cliente

            } else if (Double.parseDouble(linhaDividida[5]) == jogoMaisCaro) {

                // Se o preço for igual ao jogo mais caro, adiciona o ID à string de IDs
                idsClientesJogoMaisCaro += "," + linhaDividida[1];

            }
        }

        // Ler ficheiro Clientes
        Scanner leituraClientes = new Scanner(new File(path2));

        System.out.println("**** Jogo Mais Caro ****");
        System.out.println("Nome: " + nomeJogoMaisCaro);
        System.out.println("Preço: " + jogoMaisCaro);

        while (leituraClientes.hasNextLine()) {

            // Ler linha do ficheiro para variável "linha"
            linha = leituraClientes.nextLine();

            // Dividir a linha pelo ponto e vírgula ";"
            String[] linhaDividida = linha.split(";");

            // Verificar se o ID do cliente está na lista de IDs dos clientes que compraram o jogo mais caro
            if (idsClientesJogoMaisCaro.contains(linhaDividida[0])) {

                // Imprimir informações do cliente

                System.out.println("ID Cliente: " + linhaDividida[0] + " | " + linhaDividida[1]);

            }
        } leituraClientes.close();
    }

}
