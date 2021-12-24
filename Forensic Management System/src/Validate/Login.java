package Validate;
import java.io.File;
import Main.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import CheckRole.*;
public class Login {

    public static void Validate (String user_id, String password)
       {
           //Enter the pathway of the file in your pc 
        String fileName = "/home/singh/Desktop/java/Java-Projects-/Forensic Management System/lib/Database.csv";
        File file = new File(fileName);
        try{ 
             Scanner scan = new Scanner(file);
            while(scan.hasNext())
            {   String userid = scan.next();
                String user = userid.split(",")[0];
                String pass = userid.split(",")[1];
                if (user_id.equals(user) && password.equals(pass))
                {
                    try {
                         // Delay for 7 seonds
                         Thread.sleep(2000);   
                       }
                       catch (InterruptedException ex)
                       {
                           ex.printStackTrace();
                       }
                        System.out.println("-------------------------------------  Login Successful  ---------------------------------------------");
                        try {
                            // Delay for 1 seonds
                            Thread.sleep(600);   
                          }
                          catch (InterruptedException ex)
                          {
                              ex.printStackTrace();
                          }
                          System.out.println("Welcome "+(user.split("@")[0])+", Have a Good day!");
                        CheckRole.Role(user_id);
                    }

                }
                
                try {
                    // Delay for 7 seonds
                    Thread.sleep(2000);   
                  }
                  catch (InterruptedException ex)
                  {
                      ex.printStackTrace();
                  }
                   System.out.println("Invalid userID /password");
                   Main.getID_psw();
                   scan.close();
            

            }
            
            catch (FileNotFoundException e){

                e.printStackTrace();
             } 
        }

    }