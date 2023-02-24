import java.util.*;
public class ListLearning
{
    public static void main(String args[])
    {
        List<Integer> list= new ArrayList<Integer>();
        list.add(20);
        list.add(10);
        list.add(3);
        list.add(220);

        //iterate over the elements
        //making an iterator
        list.add(2,100);
        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //to update the element of arraylist we can use the set method
        list.set(2,30);
        System.out.println(list);

        list.remove(Integer.valueOf(10));   // to remove the object from the list
        list.remove(1);     //to remove teh element present at any index in the list
        System.out.println(list);

        int x= list.indexOf(220);
        System.out.println(x);

        System.out.println(list);
        List<Integer> list2= new ArrayList<>(); list2.add(1000); list2.add(2000); list2.add(3000); list2.add(4000);
        list.addAll(list2);
        System.out.println(list);
    }
}