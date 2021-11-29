package Passcheck;

import java.util.Scanner;

public class Scannerexample {

    public void checkPass() {

        System.out.println("Enter your password user");

        Scanner pass = new Scanner(System.in);
        String scanner = pass.nextLine();

        if (scanner.equals("Java")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Incorrect password");
        }

    }
}
