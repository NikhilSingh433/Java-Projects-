package User_management;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import Home.*;

public class CreateUser {

    public static void createuser()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Name of the user");
        String fname = scan.nextLine();
        System.out.println("Enter the Last Name of the user");
        String lname = scan.nextLine();
        System.out.println("Enter the Role(admin/police/lab)");
        String role = scan.nextLine();
        System.out.println("Enter your password");
        String pass = scan.nextLine();
        String Data = fname+"@"+role+","+pass;
        String user = fname+","+lname+","+role +","+fname+"@"+role;
        try {
            //Give the path to the file in your oen PC
            FileWriter fileWriter = new FileWriter("/home/singh/Desktop/java/Java-Projects-/Forensic Management System/lib/user.csv", true); //Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(user);  
            printWriter.close();
            }
        catch(IOException io)
        {
            System.out.println("IO Excetion");
        }
            try {
            //Give the path to the file in your oen PC
            FileWriter fileWriter = new FileWriter("/home/singh/Desktop/java/Java-Projects-/Forensic Management System/lib/Database.csv", true); //Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(Data);  
            printWriter.close();
        
            }
        catch(IOException io)
        {
            System.out.println("IO Excetion");
        }
        
        try {
            // Delay for 2 seonds
            Thread.sleep(2000);   
          }
          catch (InterruptedException ex)
          {
              ex.printStackTrace();
          }
        System.out.println("Your userID:" +fname+"@"+role);
        System.out.println("--- User Successfully Registered ---");
        System.out.println("Enter 'register' to register new user / 'home' to return");
        String fun = scan.nextLine();
        if (fun.equals("register"))
        {
            createuser();
        }
        else if(fun.equals("home"))
        {
            Admin.admin();
        }
        scan.close();
    }
    
}
