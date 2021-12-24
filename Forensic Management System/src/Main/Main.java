package Main;
import java.util.Scanner;

import Validate.*;
public class Main{
    public static void main(String[] args) {
        getID_psw();
        
    }

   public static void getID_psw()
   { 
       Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("Login");
    System.out.println("Enter your user ID");
    final String user_id = input.nextLine();
    System.out.println("Enter your Password");
    final String password = input.nextLine();
    Login.Validate(user_id, password);
    input.close();
}
}
