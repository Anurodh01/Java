import java.util.*;
public class StackList {
    public static void main(String args[])
    {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(50);
        stack.push(30);
        System.out.println(stack);

        //to see which element is at the top we use the peek() element
        System.out.println(stack.peek());

        //to pop the element from the stack
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
