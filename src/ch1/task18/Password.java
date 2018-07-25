package ch1.task18;

import java.util.Scanner;

public class Password {

    static private String password = "123456";
    static private String yourPassword;

    public String getYourPassword() {
        return yourPassword;
    }

    public void setYourPassword(String password) {
        if (yourPassword == null) {
            yourPassword = "";
        } else {
            this.yourPassword = yourPassword;
        }
    }
    
    public boolean equals(String str) {
        return (yourPassword == null ? null : password.equals(yourPassword));
    }

    public void ComparePasswords(String yourPassword) {
        if (password.equals(yourPassword)) {
            System.out.println("Your Password is true");
        } else {
            System.out.println("Your Password is false");
        }
    }

}
