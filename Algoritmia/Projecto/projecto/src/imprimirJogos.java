public class imprimirJogos {

    public static void imprimirJogosUnicos(String[] vendas) {
        System.out.println("**** Catálogo Jogos ****");

        for (int i = 0; i < vendas.length; i++) {

            boolean repetido = false;

           if (vendas[i] != null) {

                String jogoAtual = vendas[i].split(";")[4]; // Obtém o nome do jogo da linha atual

                for (int j = i + 1; j < vendas.length; j++) {

                    if (vendas[j] != null) {

                        String outroJogo = vendas[j].split(";")[4]; // Obtém o nome do jogo de outra linha

                        if (jogoAtual.equals(outroJogo)) {

                            repetido = true;
                            vendas[j] = null; // Marca a venda como repetida para não ser considerada novamente
                        }
                    }
                }
                if (!repetido) {
                    System.out.println(jogoAtual);
                }
            }
        }
    }
}
