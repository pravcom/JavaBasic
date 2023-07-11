// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = {14, 1, 2, 3, 4};
        int lengthArray = array.length;
        int firstVar = array[0];
        array[0] = array[lengthArray - 1];
        array[lengthArray - 1] = firstVar;

        System.out.printf("Сумма первого  и последнего числа массива %d", array[0] + array[lengthArray - 1]);
    }
}