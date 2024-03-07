import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] comissoes = new double[12];
        double soma = 0;

        // Ler comissoes
        for (int i = 0; i < comissoes.length; i++) {
            System.out.print("Insira o valor em comissões do mês " + (i+1) + " : ");
            comissoes[i] = input.nextInt();
        }

        // Calcular soma
        for (int i = 0; i < comissoes.length; i++) {
            soma += comissoes[i];
        }

        // Imprimir soma
        System.out.println("Total de comissões: " + soma + "€");

    }
}
