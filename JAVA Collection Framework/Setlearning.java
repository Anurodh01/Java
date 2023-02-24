import java.util.*;
public class Setlearning {
    public static void main(String args[])
    {
     
        //set is used for the unordered storage of the data
        // Set<String> set= new HashSet<>();
        // set.add("newbie");
        // set.add("noob");
        // set.add("insane");
        // set.add("professionla");
        // set.add("markdown");
        // set.add("newbie");

        // //set a iterator for the set
        // Iterator<String> itr= set.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }

        //for the ordered storage of the set we will use the linkedhashset
        // Set<String> set= new LinkedHashSet<>();
        // set.add("newbie");
        // set.add("Parle");
        // set.add("perfect");
        // set.add("ed sheeran");
        // set.add("newbie");
        // set.add("Parle");

        // System.out.println(set);



        //for the sorted data storage we will use the TreeSet
        Set<String> set= new TreeSet<>();
        set.add("Anurodh");
        set.add("Aviral");
        set.add("AAA");

        System.out.println(set);

    }
}
