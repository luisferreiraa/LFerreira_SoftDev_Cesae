import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class imprimirFicheiro {

    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        Scanner leitorFicheiro = new Scanner(new File(path));

        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            System.out.println(linha);
        }
    }
}
