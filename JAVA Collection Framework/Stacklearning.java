import java.util.*;
public class Stacklearning {
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(30);

        System.out.println(stack.peek());
        stack.add(100);
        System.out.println(stack);
        System.out.println(stack.peek());
    } 
}
