import java.util.*;
public class javaintro{
    public static int getsum(int a,int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        System.out.println("Hello World");
        System.out.println("i am anurodh singh");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String mystring= sc.nextLine();
        System.out.println("this "+mystring+" i entered in as input");
        System.out.println("enter any number so that i could perfrom some mathematical operations:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+getsum(a,b)); 
        sc.close();
       }
}