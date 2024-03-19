package Teste_002;

import java.util.Scanner;

public class Teste_002 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

int[] vetor = new int[10];
int elemento;
boolean encontrado = false;

        System.out.println("lemento a pesquisar: ");
        elemento = input.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println(elemento + "foi encontrado");
        } else {
            System.out.println(elemento + "não foi encontrado");
        }

}
}