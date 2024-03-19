package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01 {

    public static void imprimirFicheiroConsola(String path) throws FileNotFoundException {

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        while (leitorFicheiro.hasNextLine()) {      // Enquanto o scanner tiver uma próxima linha
            String linha = leitorFicheiro.nextLine();       // Variável linha é igual à próxima linha do scanner.
            System.out.println(linha);          // Imprime o conteúdo lido através da variável linha.
        }
    }

    public static void main(String[] args) {

        try {
            imprimirFicheiroConsola("Files/exercicio_01.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }
    }
}
