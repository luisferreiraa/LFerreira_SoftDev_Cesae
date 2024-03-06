import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int saldoMedio, movimentar, saldoAtual;

        System.out.println("Introduza o saldo médio: ");
        saldoMedio = input.nextInt();

        System.out.println("Introduza o valor a movimentar: ");
        movimentar = input.nextInt();

        saldoAtual = saldoMedio + movimentar;

        if (saldoAtual >= 0) {

            System.out.println("Saldo: " + saldoMedio);
            System.out.println("Valor a movimentar: " + movimentar);
            System.out.println("Saldo Atual: " + saldoAtual);
        } else {
            System.out.println("Operação inválida. Saldo insuficietne.");
        }

    }
}
