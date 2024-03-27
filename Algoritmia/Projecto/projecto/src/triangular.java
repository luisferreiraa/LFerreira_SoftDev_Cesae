public class triangular {

    public static boolean triangular(int num) {

        int somatorio = 0;

        for (int i = 1; somatorio < num; i++) {

            somatorio = somatorio + i;

            if (somatorio == num) {
                return true;
            }
        }

        return false;

    }
}
