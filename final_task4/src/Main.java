import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer;
        String rightAnswer = "Заархивированный вирус";
        String hint = "Какой-то вирус";
        String hintText = "Подсказка";
        int count = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Ответ: ");

        while (count < 3){
            answer = in.nextLine();

            if (answer.equalsIgnoreCase(hintText)){
                if (count == 0){
                    System.out.println(hint);
                    count = 2;
                    continue;
                }else{
                    System.out.println("Подсказка уже недоступна");
                    continue;
                }
            }
            if (answer.equalsIgnoreCase(rightAnswer)){
                System.out.println("Правильно");
                break;
            }
            if (count < 2 ){
                System.out.println("Подумай ещё");
                count ++;
            }
            else if (count == 2){
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}