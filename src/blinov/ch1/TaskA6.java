package blinov.ch1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaskA6 {
    public static String name = "Алексеева";
    public static LocalDateTime beginDate = LocalDateTime.of(2018, 07, 25, 20, 0);

    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println(name);
        System.out.println(beginDate.format(f));
        System.out.println(LocalDateTime.now().format(f));
    }
}
