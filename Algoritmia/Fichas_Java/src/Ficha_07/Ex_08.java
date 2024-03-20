package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_08 {

    public static double calcularValorTotalVendas(String path) throws FileNotFoundException {

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        double totalVendas = 0;
        double totalLinha = 0;

        String linha = leitorFicheiro.nextLine();                       // Lê a linha do cabeçalho

        while (leitorFicheiro.hasNextLine()) {                         // Enquanto o ficheiro tiver uma próxima linha

            linha = leitorFicheiro.nextLine();                        // Variável String linha recebe elementos da próxima linha

            String[] itensDaLinha = linha.split(",");          // Insere os elementos de cada linha num vetor, quando separados por ","
            String quantidade = itensDaLinha[2];                    // String quantidade recebe indíce 2 do vetor: "quantidade_vendida"
            String valorUnidade = itensDaLinha[3];                 // String quantidade recebe indíce 3 do vetor: "preco_unitario"

            totalLinha = Double.parseDouble(quantidade) * Double.parseDouble(valorUnidade);  // Valor total por linha é resultado da soma da quantidade+valorUnidades, convertidos para Double
            totalVendas = totalVendas + totalLinha;
        }

        leitorFicheiro.close();

        return totalVendas;
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner (System.in);

        try {
            double totalVendas = calcularValorTotalVendas("Files/exercicio_08.csv");
            System.out.println("Valor Total de Vendas: " + totalVendas + " €");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não foi encontrado.");
        }

    }
}
