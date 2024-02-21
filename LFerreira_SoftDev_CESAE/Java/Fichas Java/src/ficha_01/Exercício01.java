package ficha_01;

 import java.util.Scanner;

public class Exercício01 {

    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int n1, n2, soma;

        // Ler número 1
        System.out.println("Introduza um número:");
        n1 = input.nextInt();

        // Ler número 2
        System.out.println("Introduza outro número");
        n2 = input.nextInt();

        // Somar num 1 e num 2
        soma = (n1+n2);

        // Apresentar resultado
        System.out.println("Soma: " + soma);

    }
}
