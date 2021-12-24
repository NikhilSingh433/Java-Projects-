package Home;
//import User_management.*;
import Main.Main;
import java.util.Scanner;

public class Lab{
    public static void forensics()
    {
        System.out.println("------------------------------------------  welcome to the Forensic dashboard  ------------------------------------------");

         feature();
    }

private  static void feature() {
  Scanner input = new Scanner(System.in);
  try {
    // Delay for 2 seonds
    Thread.sleep(2000);   
  }
  catch (InterruptedException ex)
  {
    ex.printStackTrace();
  }
  System.out.println("Enter command /type 'help'"); 

       String obj = input.next();
       try {
          // Delay for 1 seonds
          Thread.sleep(1000);   
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    //list all the Actions that can be done in this project
         switch(obj)
         {    
         case "help": 
         {
            System.out.println();
         System.out.println("--commands--    :  -------------Actions---------------- ");
         System.out.println("  createlab     :        create lab report about cases profile");
         System.out.println("  viewlab       :        To view lab reports of the  cases profile");
         System.out.println("  updatelab        :        To update the lab report of the case details");
         System.out.println("  changepsw     :        to change the password");
         System.out.println("  logout        :        to logout");
         System.out.println("-----------------------------------------------------------------------------------------------");
         feature();
         break; 
         }
          case "createlab":
          {
         
        
         break;
          }
          case "viewlab":
          {
         
        
         break;
          }
          case "updatelab":
          {
         
        
         break;
          }

          case "changepsw":
          {
            //ChangePassword.Change();
        
         break;
          }
          case "logout":
          {
         
            Main.getID_psw();
        
         break;
          }


            default:     
            System.out.println("Invalid Input /type 'help' "); 
            feature();
            
        }
        input.close();  
    }
}
