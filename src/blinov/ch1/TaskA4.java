package blinov.ch1;

public class TaskA4 {

    private static String password = "123456";

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Должен быть указан ровно один аргумент командной строки!");
            return;
        }
        System.out.println(password.compareTo(args[0]) == 0);
    }
}
