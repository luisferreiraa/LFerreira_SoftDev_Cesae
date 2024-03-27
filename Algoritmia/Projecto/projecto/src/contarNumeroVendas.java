import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class contarNumeroVendas {

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
}
