import java.util.Scanner;
import java.util.ServiceConfigurationError;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение ( a +-*/ b ) -> \n");

        float a = in.nextFloat();
        String symbol = in.next();
        float b = in.nextFloat();

        switch (symbol){
            case "+": System.out.printf("Результат: %f", a + b);
                break;
            case "-": System.out.printf("Результат: %f", a - b);
                break;
            case "*": System.out.printf("Результат: %f", a * b);
                break;
            case "/": System.out.printf("%s", b != 0 ? "Результат: " +  a / b : "На ноль делить нельзя");
                break;
            default: System.out.print("Неверный знак");
                break;
        };
    }
}