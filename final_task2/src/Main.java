import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ввод:");

        String str = in.next();

        String[] words = str.split("");

        int posX = 0;
        int val1 = 0;
        int val2 = 0;
        String sign = "";
        int result = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("x") == true) {
                posX = i;
            }
            if (words[i].matches("[0-9]") == true) {
                if (val1 == 0) {
                    val1 = Integer.parseInt(words[i]);
                } else if (val2 == 0) {
                    val2 = Integer.parseInt(words[i]);
                }
            }
            if (words[i].contains("+") == true || words[i].contains("-") == true) {
                sign = words[i];
            }
        }

        switch (posX) {
            case 0:
                if (sign.contains("-")) {
                    System.out.printf("Вывод: %d", val2 + val1);
                }
                if (sign.contains("+")) {
                    System.out.printf("Вывод: %d", val2 - val1);
                }
                break;
            case 2:
                if (sign.contains("-")) {
                    System.out.printf("Вывод: %d", val1 + val2);
                }
                if (sign.contains("+")) {
                    System.out.printf("Вывод: %d", val2 - val1);
                }
                break;
            case 4:
                if (sign.contains("-")) {
                    System.out.printf("Вывод: %d", val1 - val2);
                }
                if (sign.contains("+")) {
                    System.out.printf("Вывод: %d", val1 + val2);
                }
                break;
        }


    }
}