package ch1.task18;

public class Password {

    static public String password = "123456";
    static public String yourPassword;

    public static boolean equals(String str) {
        return (yourPassword == null ? null : password.equals(yourPassword));
    }

    public static void comparePasswords(int yourPassword) {
        if (password.equals(yourPassword)) {
            System.out.println("Your Password is true");
        } else {
            System.out.println("Your Password is false");
        }
    }

    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        comparePasswords(length);
    }
}
