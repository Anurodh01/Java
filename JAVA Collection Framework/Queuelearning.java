import java.util.*;
public class Queuelearning {
    public static void main(String args[])
    {
        // Queue<Integer> queue= new LinkedList<>();
        // queue.offer(20);
        // queue.offer(100);
        // queue.offer(200);

        // System.out.println(queue.peek());


        Queue<Integer> pq= new PriorityQueue<>();     //creating a min heap
        pq.offer(200);
        pq.offer(20);
        pq.offer(100);

        System.out.println(pq.peek());

        Queue<Integer> maxheap= new PriorityQueue<>(Comparator.reverseOrder());
        maxheap.offer(100);
        maxheap.offer(200);
        maxheap.offer(1000);
        maxheap.offer(300);

        System.out.println(maxheap.peek());
    }
}
