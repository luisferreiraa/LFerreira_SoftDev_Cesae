package fichas_gpt;

public class Exercício05 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i<10 ; i++) {
            int nextNum = num1 + num2;
            System.out.println(nextNum);

            num1 = num2;
            num2 = nextNum;
        }


    }
}
