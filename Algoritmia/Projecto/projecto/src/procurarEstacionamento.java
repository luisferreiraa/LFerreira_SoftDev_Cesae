public class procurarEstacionamento {

    public static void procurarEstacionamento(int lugares) {

        System.out.println("**** Lugares Vagos ****");

        for (int i = 1; i <= lugares; i++) {
            if (i % 5 == 0 && triangular.triangular(i)) {
                System.out.println(i);
            }
        }
    }
}
