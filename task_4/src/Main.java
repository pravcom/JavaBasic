import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) { Scanner in = new Scanner(System.in);
        System.out.print("Значение числа x: ");
        float x = in.nextFloat();

        System.out.print("Значение числа y: ");
        float y = in.nextFloat();

        System.out.print("Значение числа z: ");
        float z = in.nextFloat();
        in.close();

        float avg = (x + y + z)/3;

        System.out.printf("Среднее арифметическое %f \n", avg );

        System.out.printf("%s", Math.floor(avg / 2) > 3 ? "Программа выполнена корректно" : "Программа выполнена не корректно");

    }
}