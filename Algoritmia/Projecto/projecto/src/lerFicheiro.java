import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lerFicheiro {

    public static String[] lerFicheiro(String caminho) throws FileNotFoundException {

        String[] vendas = new String[176]; // Alterar para contar

        try {

            Scanner leitura = new Scanner(new File("Files/GameStart_Vendas.csv"));

            String linha = leitura.nextLine();

            int i = 0;
            while (leitura.hasNextLine()) {

                vendas[i] = leitura.nextLine();
                i++;

            }

            leitura.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        return vendas;
    }
}
