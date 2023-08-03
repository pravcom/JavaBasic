import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] array = new int[15];

        for (int i = 0; array.length - 1 > i; i++){
            array[i] = new Random().nextInt(-20,20);
        }

        int buff;
        boolean isSort = false;
        while (!isSort){
            isSort = true;

            for (int i = 0; array.length - 1 > i; i++){
                if (array[i] < array[i+1]){
                    isSort = false;

                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
        }
        System.out.println("Массив --> " + Arrays.toString(array));
        System.out.println("Максимальный элемент массива --> " + array[0] );
        System.out.println("Минимальный элемент массива --> " + array[array.length - 1]);
    }
}