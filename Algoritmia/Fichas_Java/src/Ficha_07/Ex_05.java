package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {

    public static int calcularSoma(String path) throws FileNotFoundException {

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        // Declarar variável soma com valor 0
        int soma = 0;

        // Enquanto existir uma próxima linha para o scanner ler
        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();   // Variável linha é igual à próxima linha do scanner.
            String[] itensDaLinha = linha.split(" ");   //Os elementos da linha são divididos a cada " " e adicionados a um vetor.

            // Ciclo que adiciona à soma cada elemento do vetor.
            for (int i = 0; i < itensDaLinha.length; i++) {
                soma += Integer.parseInt(itensDaLinha[i]) ;
            }
        }

        // Fecha o scanner
        leitorFicheiro.close();

        // Devovle a soma
        return soma;
    }

    public static void main(String[] args) {

        try {
            int soma = calcularSoma("Files/exercicio_05_31.txt");
            System.out.println("A soma dos números do ficheiro é: " + soma);
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }


    }


}
