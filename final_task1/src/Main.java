import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Курс доллара ");
        float kursDollar = in.nextFloat();
        System.out.println("Кол-во рублей ");
        float rub = in.nextFloat();

        System.out.printf("Итого: %.2f", rub / kursDollar);
    }
}