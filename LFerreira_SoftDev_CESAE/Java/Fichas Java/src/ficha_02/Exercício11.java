package ficha_02;

import java.util.Scanner;

public class Exercício11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int saldoMedio, valorMovimentar, saldoAtual;

        System.out.println("Insira o Saldo Médio:");
        saldoMedio = input.nextInt();

        System.out.println("Insira o Valor a Movimentar:");
        valorMovimentar = input.nextInt();

        saldoAtual = saldoMedio + valorMovimentar;

        if (saldoAtual >= 0) {
            System.out.println("Operação válida. Saldo Atual: " + saldoAtual);
        } else {
            System.out.println("Operação inválida. Saldo Atual negativo.");
        }
    }
    }
