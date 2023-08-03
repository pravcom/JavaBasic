import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива\n");
        int size = in.nextInt();
        double[] array = new double[size];

        int sizeArray = size;

        while (size > 0) {
            System.out.print("Введите значение массива\n");
            double value = in.nextDouble();
            array[size - 1] = value;
            size--;
        }
        double sum = 0;
        for (double val : array) {
            sum = +val;
        }

        double avg = sum / sizeArray;

        for (double val : array) {
            double result =  val * avg;
            System.out.printf("%f\n", result);
        }
    }
}