// import java.io.*;
import java.util.*;

public class ScannerClass {
    public static void main(String args[])
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str= Sc.nextLine();
        System.out.print(str);
        System.out.println("Could you please add some integer so that i could make it clear");
        // int x= Sc.nextInt();
        Sc.nextLine();
        System.out.println("Enter a stirng again");
        str= Sc.nextLine();
        System.out.println(str);
        Sc.close();




        ///in a scanner class taking input if u use the nextXXX() function and after that you want to use the nextLine() function they it will not work as 
        // it will see teh nextline pointer and it will not then then skip that part.

        //so to resolve this issue please add one more sc.nextLine() in between nextXXX() and nextLine() 
    }
    
}
