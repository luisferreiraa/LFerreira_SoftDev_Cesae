package fichas_gpt;

public class Exercício04 {

    public static void main(String[] args) {

        int soma = 0;
        int n;

        // enquanto n é menor ou igual a 1, acresce 1
        for (n = 1; n <= 100; n++) {

            //soma = n + soma
            soma += n;
        }
        System.out.println(soma);
    }
}
