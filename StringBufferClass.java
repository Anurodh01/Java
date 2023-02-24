import java.util.*;
public class StringBufferClass {
    public static void main(String args[])
    {
        StringBuffer sb1= new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb2= new StringBuffer(20);
        System.out.println(sb2.capacity());
        StringBuffer sb= new StringBuffer("Anurodh Singh");
        
        System.out.println(sb.length());


        ///to append in ths string buffer use append() function
        sb.append(" chalu");
        System.out.println(sb);
        
        //to insert the any string at any pos
        sb.insert(4," param ");
        System.out.println(sb);

        //to replace something in stringbuffer class
        sb.replace(0,10,"aalu");
        System.out.println(sb);

        StringBuffer sbx= new StringBuffer("Hello");
        sbx.delete(0, 3);
        System.out.println(sbx);


        //to reverse the string in the string buffer we will use the reverse function
        StringBuffer rev= new StringBuffer("I am going to ahmedabad");
        rev.reverse();
        System.out.println(rev);

        rev.setCharAt(8, 'p');
        System.out.println(rev);

        System.out.println(rev.toString());
    }
    
}
