package CheckRole;
import Home.Admin;
import Home.Lab;
import Home.Police;

public class CheckRole {
    public static void Role(String user_id)
    {
                String role =user_id.split("@")[1];
                //System.out.println(role);
                
                switch(role)
                {    
                case "police": 
                { 
                    System.out.println();
                System.out.println(" Redirecting to the police dashboard ");
                try {
                    // Delay for 2 seonds
                    Thread.sleep(2000);   
                  }
                  catch (InterruptedException ex)
                  {
                      ex.printStackTrace();
                  }
                     Police.police();
                break; 
                }
                 case "lab":
                 { 
                    System.out.println();
                    System.out.println(" Redirecting to the Forensics dashboard ");
                    try {
                        // Delay for 2 seonds
                        Thread.sleep(2000);   
                      }
                      catch (InterruptedException ex)
                      {
                          ex.printStackTrace();
                      }
                      Lab.forensics();
                    break; 
                    }
                    case "admin":
                 { 
                    System.out.println();
                    System.out.println(" Redirecting to the Admin dashboard");
                    try {
                        // Delay for 2 seonds
                        Thread.sleep(2000);   
                      }
                      catch (InterruptedException ex)
                      {
                          ex.printStackTrace();
                      }
                      Admin.admin();
                      
                    break; 
                    }

                    default:     
                   System.out.println("No roles found for you"); 
               
                 }
    }
    
}
