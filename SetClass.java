import java.util.*;
public class SetClass {
    public static void main(String args[])
    {
        //set are of the three types 
        //first is hashset: it doesn't maintain the order of the element is inserted 
        Set<Integer> set= new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(10);
        System.out.println(set);

        set.remove(30);
        System.out.println(set);

        System.out.println(set.contains(10));


        //now the linkedhasset is used to maintain the ordering of insertion
        Set<Integer> listset = new LinkedHashSet<>();
        listset.add(10);
        listset.add(20);
        listset.add(2);
        listset.add(3330);
        System.out.println(listset);

        //using the tree set to keep the sorted order data
        Set<Integer> treeset= new TreeSet<>();
        treeset.add(110);
        treeset.add(222);
        treeset.add(11);
        treeset.add(20);
        treeset.add(2);

        System.out.println(treeset);

        System.out.println(treeset.size());
        System.out.println(treeset.remove(110));

        
    }
}
