public class Main {
    public static void main(String[] args) {

        String myStr = "I like Java!!!";

        boolean contain = myStr.contains("Java");
        System.out.println("Проверить, содержит ли строка подстроку “Java --> " + contain);
        boolean startsWith = myStr.startsWith("I like");
        System.out.println("Проверить, начинается ли строка с подстроки “I like --> " + startsWith);
        boolean endsWith = myStr.endsWith("!!!");
        System.out.println("Проверить, заканчивается ли строка с подставки !!! --> " + endsWith);

        if (contain == true && startsWith == true && endsWith == true) {
            String upCase = myStr.toUpperCase();
            System.out.println(upCase);

            String replace = myStr.replaceAll("a", "o");
            System.out.println(replace.substring(7,11));
        }



    }
}