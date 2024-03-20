package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {

    public static int contarLinhas(String path) throws FileNotFoundException {

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        int linhas = 0;

        while (leitorFicheiro.hasNextLine()) {
            linhas = linhas + 1;
            leitorFicheiro.nextLine();

        }
        leitorFicheiro.close();
        return linhas;
    }

    public static int contarPalavras(String path) throws FileNotFoundException {

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        int palavras = 0;

        // Enquanto existir uma próxima linha para o scanner ler
        while (leitorFicheiro.hasNext()) {
            palavras++;
            leitorFicheiro.next();
        }
        // Fecha o scanner
        leitorFicheiro.close();

        // Devolve a soma
        return palavras;
    }

    public static void main(String[] args) throws FileNotFoundException {

        try {
            int linhas = contarLinhas("Files/exercicio_07.txt");
            System.out.println("Número de linhas: " + linhas);
            int palavras = contarPalavras("Files/exercicio_07.txt");
            System.out.println("Número de linhas: " + palavras);
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }


    }

}

