import java.util.*;
public class QueueClass {
    public static void main(String args[])
    {
        Queue<Integer> queue= new PriorityQueue<>();
        queue.add(19);
        queue.add(10);
        queue.add(100);
        for(Integer itr: queue)
        System.out.println(itr);

        int x= queue.poll();
        System.out.println(x);
    }
}
