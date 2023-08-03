import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int i;
        int j;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите число строк матрицы: ");
        a = reader.nextInt();

        System.out.print("Введите число столбцов матрицы: ");
        b = reader.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Пустой массив");
            return;
        }

        double[][] matrix = new double[a][b];
        System.out.println("Данные элементов массива: ");
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                matrix[i][j] = reader.nextDouble();
            }
        }

        System.out.print("Полученный массив чисел:");
        for (j = 0; j < b; j++) {
            matrix[0][j] = matrix[0][j] * 3;
            System.out.print(" " + matrix[0][j]);
        }
    }
}