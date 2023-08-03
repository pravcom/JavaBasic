import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Ввести первое число с клавиатуры \n");
        String firstVal = reader.next();

        System.out.print("Ввести второе число с клавиатуры \n");
        int secondVal = reader.nextInt();

        Integer firstValInt = Integer.valueOf(firstVal);

        int result = firstValInt.compareTo(secondVal);
        double doubleVal;

        switch (result) {
            case 0:
                System.out.print("Числа равны\n");
                break;
            case 1:
                doubleVal = secondVal;
                System.out.printf("Большее число --> %d\nМеньшее число --> %f\n", firstValInt, doubleVal);
                break;
            case -1:
                doubleVal = firstValInt;
                System.out.printf("Большее число --> %d\nМеньшее число --> %f\n", secondVal, doubleVal);
                break;
        }
    }
}