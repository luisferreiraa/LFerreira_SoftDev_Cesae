package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {

    public static String pessoaMaisVelha(String path) throws FileNotFoundException {

        // Declarar variáveis
        String nomeMaisVelho = "";
        int maiorIdade = 0;

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        while (leitorFicheiro.hasNextLine()) {          // Enquanto existir uma próxima linha para o scanner ler
            String linha = leitorFicheiro.nextLine();       // Atribui a próxima linha lida à String linha
            String[] itensDaLinha = linha.split(",");       // Separa os elementos da linha separados por uma vírgula e atribui a um vetor

            String nome = itensDaLinha[0];      // Atribui o elemento do vetor na posição 0 à String nome
            int idade = Integer.parseInt(itensDaLinha[1]);      // Converte a String na posição [1] em int e atribui à variável idade

            if (idade > maiorIdade) {       // Se idade maior que maiorIdade -> atribuir nome e idade a variáveis
                nomeMaisVelho = nome;
                maiorIdade = idade;
            }
        }
        leitorFicheiro.close();     // Fechar scanner
        return nomeMaisVelho;
    }

    public static void main(String[] args) {

        try {
            String nomeMaisVelho = pessoaMaisVelha("Files/exercicio_06.txt");
            System.out.println("A pessoa mais velha é: " + nomeMaisVelho);
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }
    }
}
