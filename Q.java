import java.util.*;
public class Q {
    public static void main(String args[])
    {
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(40);
        queue.offer(90);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


        // now if we want to prioritize the element inside the queue then wwe will use the priority queue
        Queue<Integer> pq= new PriorityQueue<>();
        pq.offer(20);
        pq.offer(30);
        pq.offer(9);
        pq.offer(4);
        System.out.println(pq);
        for(Integer ele: pq)
        System.out.println(ele);

        //as java by default makes the  min heap we can make the max heap as 
        Queue<Integer> maxheap= new PriorityQueue<>(Comparator.reverseOrder());
        maxheap.offer(20);
        maxheap.offer(40);
        maxheap.offer(30);
        System.out.println(maxheap);
        System.out.println(maxheap.peek());
        System.out.println(maxheap.poll());
        System.out.println(maxheap.peek());

        //implementing deque 
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        dq.offer(10);
        dq.offerFirst(20);
        dq.offerLast(39);
        dq.offer(330);
        System.out.println(dq);
    }
}
