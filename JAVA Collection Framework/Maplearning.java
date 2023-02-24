import java.util.*;
public class Maplearning {
    public static void main(String args[])
    {
        // Map<Integer, String> mp= new HashMap<Integer, String>();
        // mp.put(1,"Anurodh");
        // mp.put(10,"Mitchell");
        // mp.put(2,"Aviral");
        // mp.put(3,"Apoorva");
        // mp.put(-1,"Marshall");

        // for(Map.Entry<Integer,String> ele: mp.entrySet())
        // {
        //     System.out.println(ele.getKey()+" "+ele.getValue());
        // }



        //linkedHashmap maintains theorder of insertion and deletion 
        // Map<Integer, String> map= new LinkedHashMap<>();
        // map.put(13,"Adobe");
        // map.put(11,"Nagaroo");
        // map.put(10,"Tata Consultancy");
        // map.put(33,"Mahindar tech");

        // for(Map.Entry<Integer, String> element: map.entrySet())
        // {
        //     System.out.println(element.getKey()+" "+element.getValue());
        // }


        //TreeHashMap is used to have to ordered map 
        TreeMap<Integer, String> map= new TreeMap<>();
        map.put(100,"Tech Mahindra");
        map.put(11,"Tata Consultancy");
        map.put(129,"Nagarro");
        map.put(111,"Marshell maelllo");

        for(Map.Entry<Integer,String> ele: map.entrySet())
        {
            System.out.println(ele.getKey()+" "+ele.getValue());
        }
    }
}
