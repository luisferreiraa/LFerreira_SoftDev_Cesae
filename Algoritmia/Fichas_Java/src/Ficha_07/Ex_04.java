package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_04 {

    public static void copiarFicheiro (String path) throws FileNotFoundException {

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        // Enquanto o scanner tiver uma próxima linha
        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();   // Variável linha é igual à próxima linha do scanner.
            System.out.println(linha);      // Imprime na consola o conteúdo lido através da variável linha.
        }
    }

    public static void main(String[] args) {

        try {
            copiarFicheiro("Files/exercicio_04.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }
    }
}
