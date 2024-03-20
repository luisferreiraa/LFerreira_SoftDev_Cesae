import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Ficha_07.Ex_07.contarLinhas;

public class Ex_09_alt {




    /**
     * Método que conta as colunas de um ficheiro estruturado
     *
     * @param path        - caminho para o ficheiro
     * @param delimitador - delimitador que separa as colunas
     * @return numero de colunas
     */
    public static int contarColunas(String path, String delimitador) {

        Scanner leitura = new Scanner(new File(path));

        String linha = leitura.nextLine();

        String[] linhaDividida = linha.split(delimitador);

        int numeroColunas = linhaDividida.length;

        return numeroColunas;
    }

    /**
     * Metodo que lê um ficheiro estruturado para uma matriz
     *
     * @param path
     * @return
     */
    public static String[][] lerFicheiroMatriz(String path) {

        // Declarar matriz à medida
        String[][] matrizCompleta = new String[contarLinhas(path) - 1][contarColunas(path, ",")];

        // Scanner atual
        Scanner leitura = new Scanner(new File(path));

        // Linha atual
        String linha = leitura.nextLine();

        int contadorLinha = 0;

        while (leitura.hasNextLine()) {

            linha = leitura.nextLine();

            String[] linhaDividida = linha.split(",");

            for (int i = 0; i < matrizCompleta[0].length; i++) {
                matrizCompleta[contadorLinha][i] = linhaDividida[i];
            }

            contadorLinha++;

        }

        return matrizCompleta;
    }
}

    public static void main(String[] args) {

        String path = "Files/exercicio_09.csv";

        String[][] matrizFicheiro = lerFicheiroMatriz(path);
    }

