import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите положительное целое число\n");
        int val = in.nextInt();
        int sum = 0;
        for (int i = 1; val >= i; i++){
            if (i %2 != 0){
                sum += i;
            }
        }

        System.out.printf("Сумма -> %d",sum);

    }
}