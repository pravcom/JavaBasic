import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        double g;
        double kg;
        double m;
        double km;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите физическую величину (1 - масса, 2 - расстояние): ");
        a = reader.nextInt();

        switch (a) {
            case 1:
                System.out.print("Введите единицу измерения (1 - грамм, 2 - килограмм): ");
                b = reader.nextInt();

                switch (b) {
                    case 1:
                        System.out.print("Введите число: ");
                        g = reader.nextDouble();
                        kg = g / 1000;
                        System.out.printf("Результат: \n Граммы: %.3f \n Килограммы: %.3f", g, kg);
                        break;
                    case 2:
                        System.out.print("Введите число: ");
                        kg = reader.nextDouble();
                        g = kg * 1000;
                        System.out.printf("Результат: \n Граммы: %.3f \n Килограммы: %.3f", g, kg);
                        break;
                    default:  System.out.println("Ошибка ввода");
                        return;
                }
                break;

            case 2:
                System.out.print("Введите единицу измерения (1 - метр, 2 - километр): ");
                c = reader.nextInt();

                switch (c) {
                    case 1:
                        System.out.print("Введите число: ");
                        m = reader.nextDouble();
                        km = m / 1000;
                        System.out.printf("Результат: \n Граммы: %.3f \n Килограммы: %.3f", m, km);
                        break;
                    case 2:
                        System.out.print("Введите число: ");
                        km = reader.nextDouble();
                        m = km * 1000;
                        System.out.printf("Результат: \n Метры: %.3f \n Километры: %.3f", m, km);
                        break;
                    default:  System.out.println("Ошибка ввода");
                        return;
                }
                break;
            default:  System.out.println("Ошибка ввода");
                return;
        }
    }
}