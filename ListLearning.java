import java.util.*;
public class ListLearning {
    public static void main(String args[])
    {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        for(Integer ele: list)
        System.out.println(ele);

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }    
}
