package Collections;
import java.util.*;
public class Arraylistclass {
    public static void main(String args[])
    {
        ArrayList<String> array= new ArrayList<>();
        array.add("Anurodh");
        array.add("Aviral");
        array.add("Apoorva");   //to add elements in arraylist
        array.add("Chimptu");

        //iterate the arraylist
        for(String str: array)
        System.out.println(str);

        ArrayList<Integer> number= new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(1);
        number.add(9);

        Collections.sort(number);   //used to sort the arraylist
        for(Integer i: number)
        System.out.println(i);

        Collections.reverse(number);    //to reverse the arraylist we use Collections.reverse() function
       
        //to remove value at any index it can also be used to delete the object directly giving
        number.remove(1);

        //to set a specific value at any particular index
        number.set(1,100);
        for(Integer i: number)
        System.out.println(i);
    }
}
