import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int rowCount = in.nextInt();
        String[] str = new String[rowCount];
        String[][] countSymbols = new String[rowCount][2];

        for (int i = 0; i < rowCount; i++){
            System.out.println("Введите строку: ");
            str[i] = in.next();
        }

        Set uniqueSymbols = new HashSet();
        //Проходим в цикле по введеным строкам
        for (int i = 0; i < str.length; i++){
            uniqueSymbols = new HashSet();
            //В цикле проходим по каждому символу строки
            for(int y=0; y < str[i].length(); y++){
                uniqueSymbols.add(str[i].charAt(y));
            }
            //записываем номер строки и кол-во символов строки
            countSymbols[i][0] = String.valueOf(i);
            countSymbols[i][1] = String.valueOf(uniqueSymbols.size());
        }

        int[][] max = {{Integer.parseInt(countSymbols[0][0]), Integer.parseInt(countSymbols[0][1]) } };
        //Находим максимальный элемент массива
        for (int i=0; i < countSymbols.length; i++){
            int value = Integer.parseInt(countSymbols[i][1]);
            if (value > max[0][1]){
                max[0][0] = i;
                max[0][1] = value;
            }
        }

        System.out.println(str[max[0][0]]);


    }
}