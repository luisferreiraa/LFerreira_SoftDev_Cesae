import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class imprimirCatalogoCategoria {

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
}
