package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {

    public static void copiarFicheiro (String path1, String path2) throws FileNotFoundException {

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path1));

        // Inicializar o writer num novo ficheiro criado
        PrintWriter maquinaEscrever = new PrintWriter(new File(path2));

        while (leitorFicheiro.hasNextLine()) {      // Enquanto o scanner tiver uma próxima linha
            String linha = leitorFicheiro.nextLine();       // Variável linha é igual à próxima linha do scanner.
            maquinaEscrever.println(linha);     // Copia o valor de linha para o novo ficheiro
        }

        // Fechar scanner e printer
        leitorFicheiro.close();
        maquinaEscrever.close();
    }

    public static void main(String[] args) {

        try {
            copiarFicheiro("Files/exercicio_03.txt", "Files/exercicio_03_copia.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }
    }
}
