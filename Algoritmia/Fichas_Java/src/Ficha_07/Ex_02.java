package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void main(String[] args) {

        try {

            criarFicheiroComMensagem("Files/exercicio_02_mensagem", "Esta é a mensagem do exercício 2 da Ficha de trabalho 7.");


        } catch (FileNotFoundException e) {
            System.out.println("Impossível criar ficheiro.");
        }
    }

    public static void criarFicheiroComMensagem(String path, String mensagem) throws FileNotFoundException {

        // Inicializar o writer num novo ficheiro criado
        PrintWriter maquinaEscrever = new PrintWriter(new File(path));

        // Imprimir a mensagem no ficheiro através do writer
        maquinaEscrever.print(mensagem);

        // Termina o writer
        maquinaEscrever.close();


    }
}
