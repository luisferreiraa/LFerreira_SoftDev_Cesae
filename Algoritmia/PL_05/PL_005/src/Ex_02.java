import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] comissoes = new double[12];
        double soma = 0;

        for (int i = 0; i < comissoes.length; i++) {
            System.out.println("Mês " + (i+1) + ": ");
            comissoes[i] = input.nextDouble();
        }

        for (int i = 0; i < comissoes.length; i++) {
            soma += comissoes[i];
        }

        System.out.println("Total Anual de Comissões: " + soma + "€");


    }
}
