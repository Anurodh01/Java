import java.io.BufferedReader;
import java.io.*;
// import java.util.*;
public class Application {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter the value of x");
        int x= Integer.parseInt(br.readLine());
        System.out.println(x);

        // console input
        Console c= System.console();
        char password[]= new char[30];
        System.out.println("Enter the password");
        password= c.readPassword();
        String pass= String.valueOf(password);
        System.out.println("you entered: "+pass);
    }
}
