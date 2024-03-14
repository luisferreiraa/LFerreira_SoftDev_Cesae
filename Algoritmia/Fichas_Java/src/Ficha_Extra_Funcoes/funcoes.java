package Ficha_Extra_Funcoes;

public class funcoes {

    /**
     * Calcula e devovle o número mais pequeno de 3 números.
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    static int numeroMaisPequeno(int num1, int num2, int num3) {
        int menor = 0;

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        }

        if (num2 < num1 && num2 < num3) {
            menor = num2;
        }

        if (num3 < num1 && num3 < num2) {
            menor = num3;
        }
        return menor;
    }

    /**
     * Calcula e devolve a media de 3 números.
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    static double media(double num1, double num2, double num3) {

        double resultado;
        double x;

        x = (num1 + num2 + num3);
        resultado = x / 3;

        return resultado;
    }

    /**
     * Calcula e devolve a área de um retângulo.
     *
     * @param largura
     * @param altura
     * @return
     */
    static double calcularAreaRetangulo(int largura, int altura) {

        double resultado;

        resultado = altura * largura;

        return resultado;
    }

    /**
     * Calcula e imprime a tabuada de um número inserido pelo utilizador de 1 a 10.
     * @param num
     */
    static void imprimirTabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            int resultado = i * num;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }

}
