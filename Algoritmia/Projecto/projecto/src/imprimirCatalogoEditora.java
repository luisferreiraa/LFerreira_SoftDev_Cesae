import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class imprimirCatalogoEditora {

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
}
