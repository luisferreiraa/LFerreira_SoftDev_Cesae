import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class totalVendas {

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
}
