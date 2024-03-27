import java.io.FileNotFoundException;
import java.util.Scanner;

public class imprimirGraficos {

    public static void imprimirGraficos() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int escolha;

        do {

            System.out.println("1. Call Of Duty");
            System.out.println("2. FIFA");
            System.out.println("3. Hollow Knight");
            System.out.println("4. Minecraft");
            System.out.println("5. Mortal Kombat");
            System.out.println("6. Overcooked");
            System.out.println("7. Witcher 3");

            System.out.println("Escolha o Catálogo Gráfico: ");
            escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    imprimirFicheiro.imprimirFicheiro("Files/CatalogoGrafico/callOfDuty.txt");
                    break;
                case 2:
                    imprimirFicheiro.imprimirFicheiro("Files/CatalogoGrafico/fifa.txt");
                    break;
                case 3:
                    imprimirFicheiro.imprimirFicheiro("Files/CatalogoGrafico/hollowKnight.txt");
                    break;
                case 4:
                    imprimirFicheiro.imprimirFicheiro("Files/CatalogoGrafico/minecraft.txt");
                    break;
                case 5:
                    imprimirFicheiro.imprimirFicheiro("Files/CatalogoGrafico/mortalKombat.txt");
                    break;
                case 6:
                    imprimirFicheiro.imprimirFicheiro("Files/CatalogoGrafico/overcooked.txt");
                    break;
                case 7:
                    imprimirFicheiro.imprimirFicheiro("Files/CatalogoGrafico/witcher3.txt");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (escolha != 0);
    }
}
