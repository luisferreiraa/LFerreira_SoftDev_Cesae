package ficha_03;

public class Exercício03 {

    public static void main(String[] args) {

        int num;
        num = 531;

        while (num % 2 != 0 && num >= 531 && num <= 750) {
            System.out.println(num);
            num = num + 2;
        }
    }
}
