
package checklogincredential;
import java.util.Scanner;

class UsernameException extends Exception 
{
 
 public UsernameException(String msg) {
  super(msg);
 }
}

class PasswordException extends Exception {
 
 public PasswordException(String msg) {
  super(msg);
 }
}
public class CheckLoginCredential {

    
    public static void main(String[] args)
    {
  Scanner s = new Scanner(System.in);
  String username, password;
  
  System.out.print("Enter username :: ");
  username = s.nextLine();
  
  System.out.print("Enter password :: ");
  password = s.nextLine();
  
  int length = username.length();
  
  try 
  {
    if(!username.equals("admin"))
    throw new UsernameException("Username must be admin");
   else if(!password.equals("admin"))
    throw new PasswordException("Incorrect password\nType correct password ???");
   else
    System.out.println("Login Successful !!!");
  }
  catch (UsernameException u) 
  {
   u.printStackTrace();
  }
  catch (PasswordException p) 
  {
   p.printStackTrace();
  }
  finally 
  {
   System.out.println("The finally statement is executed");
  }
 }
}

  
        
