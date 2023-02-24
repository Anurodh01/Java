
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Buffered_Reader
{
    public static void main(String args[])
    {
        try{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        System.out.print("you entered "+str);
        System.out.println("Enter a interger");
        int x= Integer.parseInt( br.readLine());
        System.out.println("you entered a integer"+x);
        System.out.println("enter the string again");
        str= br.readLine();
        System.out.println(str);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}