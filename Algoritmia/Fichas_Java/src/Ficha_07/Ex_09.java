package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) throws FileNotFoundException, InputMismatchException {

        try {

            Scanner input = new Scanner(System.in);
            int opcao;
            String musica;
            int contador;

            // Apresentar menu enquanto opção escolhida é diferente de 0
            do {
                System.out.println("1. Pesquisar músicas por género.");
                System.out.println("2. Pesquisar músicas por artista.");
                System.out.println("3. Pesquisar música com maior duração.");
                System.out.println("4. Pesquisar músicas com duração acima de x.");
                System.out.println("5. Consultar número de músicas no ficheiro.");
                System.out.println("0. Sair.");
                System.out.print("\n");

                System.out.println("Escolha uma opção: ");
                opcao = input.nextInt();
                input.nextLine();

                // Switch Case
                switch (opcao) {
                    case 1:
                        musicasPorGenero("Files/exercicio_09.csv");
                        System.out.println();
                        break;
                    case 2:
                        musicasPorArtista("Files/exercicio_09.csv");
                        System.out.println();
                        break;
                    case 3:
                        maiorDuracao("Files/exercicio_09.csv");
                        break;
                    case 4:
                        System.out.println("Em desenvolvimento.");
                    case 5:
                        int linhas = quantasMusicas("Files/exercicio_09.csv");
                        System.out.println("Número de músicas no ficheiro: " + linhas);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

            } while (opcao != 0);

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não foi encontrado.");
        } catch (InputMismatchException z) {
            System.out.println("Insira uma opção válida.");
        }
    }

    public static void musicasPorGenero(String path) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        String generoPesquisar;
        String genero;
        String musica;

        System.out.println("Escolha um género a pesquisar: ");
        generoPesquisar = input.nextLine();

        String linha = leitorFicheiro.nextLine();      // Linha de cabeçalho

        while (leitorFicheiro.hasNextLine()) {
            linha = leitorFicheiro.nextLine();
            String[] itensDaLinha = linha.split(",");

            genero = itensDaLinha[2];
            musica = itensDaLinha[0];

            if (genero.equals(generoPesquisar)) {
                System.out.println(musica);
            }
        }
        leitorFicheiro.close();
    }

    public static void musicasPorArtista(String path) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        String artistaPesquisar;
        String artista;
        String musica;

        System.out.println("Escolha um artista a pesquisar: ");
        artistaPesquisar = input.nextLine();

        String linha = leitorFicheiro.nextLine();      // Linha de cabeçalho

        while (leitorFicheiro.hasNextLine()) {
            linha = leitorFicheiro.nextLine();
            String[] itensDaLinha = linha.split(",");

            artista = itensDaLinha[1];
            musica = itensDaLinha[0];

            if (artista.equals(artistaPesquisar)) {
                System.out.println(musica);
            }
        }
        leitorFicheiro.close();
    }

    public static void maiorDuracao(String path) throws FileNotFoundException {

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        String linha = leitorFicheiro.nextLine();      // Linha de cabeçalho

        while (leitorFicheiro.hasNextLine()) {

            linha = leitorFicheiro.nextLine();

            String[] itensDaLinha = linha.split(",");

            String tempo = itensDaLinha[3];

            String musica = itensDaLinha[0];

            String[] partes = tempo.split(":");

            double duracao = Integer.parseInt(partes[0]) + Integer.parseInt(partes[1]));

            double maior = 0;

            if (duracao > maior) {
                duracao = maior;
            }

            System.out.println(duracao);
        }

        leitorFicheiro.close();

    }

    public static int quantasMusicas(String path) throws FileNotFoundException {

        // Inicializar o scanner de leitura do ficheiro
        Scanner leitorFicheiro = new Scanner(new File(path));

        int linhas = 0;
        String linha = leitorFicheiro.nextLine();      // Linha de cabeçalho

        while (leitorFicheiro.hasNextLine()) {
            linha = leitorFicheiro.nextLine();
            linhas = linhas + 1;
        }
        leitorFicheiro.close();
        return linhas;
    }
}
