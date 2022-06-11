package users;

import java.util.Scanner;

public class User {     //ABSTRACT
    private char[] password;    //hashing sha256
    private String username;
    //private boolean isAdmin;
    Scanner scanner = new Scanner(System.in);   //NOT HERE

    protected boolean logIn() {
        System.out.println("Enter username: ");
        this.username = scanner.next();
        System.out.println("Enter password: ");
        this.password = scanner.next().toCharArray();

        if (this.password.equals(password) && this.username.equals(username)) { // WHILE
            System.out.println("Login successful");
            return true;
        }
        else {
            System.out.println("Wrong username/password! Try again.");
            return false;
        }
    }
}
