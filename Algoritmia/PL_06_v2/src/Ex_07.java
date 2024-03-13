import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        // Importar o scanner
        Scanner input = new Scanner(System.in);

        // Variáveis
        char caracter;
        int linhas;
        int colunas;

        // Ler caracter
        System.out.println("Insira o caracter a utilizar: ");
        caracter = input.next();

        // Ler número de linhas
        System.out.println("Insira o número de linhas: ");
        linhas = input.nextInt();

        // Ler número de colunas
        System.out.println("Insira o número de colunas: ");
        colunas = input.nextInt();
    }
}
