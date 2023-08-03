import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = in.nextLine();

        String[] wordsOfStr = str.split(" ");
        int counter = 0;
        for (String word : wordsOfStr
        ) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > 0) {
                System.out.println(word);
                counter++;
            }
        }
        System.out.println(counter);
    }
}