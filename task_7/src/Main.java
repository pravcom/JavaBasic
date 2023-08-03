import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final float x = 1;
        final float y = 2;
        final float z = 3;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива\n");
        int size = in.nextInt();
        float[] array = new float[size];

        while ( size > 0 ){
            System.out.print("Введите значение массива\n");
            float value = in.nextFloat();
            array[size - 1] = value;
            size--;
        }

        for (float arrayVal: array) {
          if (arrayVal == x || arrayVal == y || arrayVal == z){
              System.out.printf("Данное %.1f значение находится в константах \n", arrayVal);
          }
        }
    }
}