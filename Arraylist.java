import java.util.*;
public class Arraylist {
    public static void main(String args[])
    {
        ArrayList<String> arraylist= new ArrayList<>();
        arraylist.add("Anurodh");
        arraylist.add("Jitendra");
        arraylist.add("Anuj");
        arraylist.add(1,"KIll");
        System.out.println(arraylist);

        //to add the element at any index we will use the add(index, element ) method and add(element) to add the element at the last of the list
        //to add the list at the last of the array list we will use the addAll(list)
        ArrayList<String> messages= new ArrayList<>();
        messages.add("Hey");
        messages.add("HII");
        messages.add("Hello");

        arraylist.addAll(messages);
        System.out.println(arraylist);

        //to get the element from the arraylist
        System.out.println(arraylist.get(2));

        //to remove a element from tehe arraylist
        arraylist.remove(2);
        System.out.println(arraylist);
        //to remove the element object
        arraylist.remove("Hello");
        System.out.println(arraylist);

        //set(index,element) is used to update the element at any index
        arraylist.set(1,"INDIA");
        System.out.println(arraylist);
        
        //to know that list contains a element or not we use the contains(element) function

        System.out.println(arraylist.contains("HII"));
        System.out.println(arraylist.contains("Me"));

        //to iterate
        for(int i=0;i<arraylist.size();i++)
        System.out.print(arraylist.get(i)+" ");

        //to iterate the element in list
        Iterator<String> itr= arraylist.iterator();
        while(itr.hasNext())
        System.out.println("iterator: "+itr.next());

        //to remove the whole list using clear() function
        arraylist.clear();
        System.out.println(arraylist);
    }
}
