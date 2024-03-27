import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pesquisarCliente {

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
}
