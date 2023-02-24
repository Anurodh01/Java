import java.io.Console;

public class consoleclassstotakeinput {
    public static void main(String args[])
    {
        
        //to take input of password using the console class
        
        Console con= System.console();
        System.out.println("Enter the name");
        String name= con.readLine();
        System.out.println("Enter password");
        char[] ch= con.readPassword();
        String password= String.valueOf(ch);
        System.out.println("User "+ name+" has entered password as "+password);
    }
    
}
