import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pesquisarVendas {

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
}
