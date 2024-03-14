package ex_funcao_grupos;

public class estabilidade_alt {
    static double aoQuadrado (double n) {
        return n * n;
    }
    static double raizQuadrada (double n) {
        double temp;
        double sr = n / 2;
        do {
            temp = sr;
            sr = (temp + (n / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }
    static double[] calcularMedia (double[][] vendasFuncionario) {
        double [] mediaFuncionarios = new double[vendasFuncionario.length];
        // calcular medias
        double media, soma=0, count=0;
        for (int i=0; i<vendasFuncionario.length; i++) {
            for (int j=1;j< vendasFuncionario[0].length; j++) {
                soma += vendasFuncionario[i][j];
                count++;
            }
            media = soma / count;
            mediaFuncionarios[i] = media;
            soma = 0;
            count = 0;
        }
        return mediaFuncionarios;
    }
    static double[] calcularDesvio (double[][] vendasFuncionario, double[] mediaFuncionarios) {
        double [] desvioFuncionarios = new double[vendasFuncionario.length];
        double resultado = 0, desvio, valorFinal;

        for (int i=0; i< vendasFuncionario.length; i++) {
            for (int j=1; j<= vendasFuncionario.length; j++) {
                resultado += aoQuadrado(vendasFuncionario[i][j] - mediaFuncionarios[i]);
            }

            desvio = resultado/(vendasFuncionario[0].length -1);
            valorFinal = raizQuadrada(desvio);

            desvioFuncionarios[i] = valorFinal;
        }
        return desvioFuncionarios;
    }
    static double funcComMenorDesvio (double[][] vendasFuncionario, double[] desvioFuncionarios) {
        double menorDesvio=0, indentificador_menor=0;
        for (int n=0; n< desvioFuncionarios.length;n++){

            if( n==0 || desvioFuncionarios[n]<menorDesvio){
                menorDesvio =  desvioFuncionarios[n];
                indentificador_menor= vendasFuncionario[n][0];
            }
        }

        return indentificador_menor;
    }
    static double funcComMaiorDesvio (double[][] vendasFuncionario, double[] desvioFuncionarios) {
        double maior=0, indentificador_maior=0;
        for (int n=0; n< desvioFuncionarios.length;n++){
            if(n==0|| desvioFuncionarios[n]>maior){
                maior =  desvioFuncionarios[n];
                indentificador_maior=vendasFuncionario[n][0];
            }
        }
        return indentificador_maior;
    }

    static int estabilidade (double[][] vendasFuncionario, boolean maisEstavel) {     // true - mais estavel  | false - menos estavel
        double [] mediaFuncionarios = calcularMedia(vendasFuncionario);
        double [] desvioFuncionarios = calcularDesvio(vendasFuncionario, mediaFuncionarios);

        if (maisEstavel) {
            return (int) funcComMenorDesvio(vendasFuncionario, desvioFuncionarios);
        }
        return (int) funcComMaiorDesvio(vendasFuncionario, desvioFuncionarios);
    }

    public static void main(String[] args) {

        double [][] vendasFuncionario = {
                {0, 1905, 3140, 908},
                {1, 2140, 4412, 1102},
                {2, 420, 1290, 599}
        };

        System.out.println("Mais estável: " + estabilidade(vendasFuncionario, true));
        System.out.println("Menos estável: " + estabilidade(vendasFuncionario, false));

    }
}