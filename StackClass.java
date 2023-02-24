import java.util.*;
public class StackClass {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");

            //to display the element in stack
        // for(String str: stack)
        // {
        //     System.out.println(str);
        // }

        //to get the element present on the top of the stack peek() is function us used
        String topelement= stack.peek();
        System.out.println("The element present at top of the stack: "+topelement);

        String poppedelement= stack.pop();
        System.out.println("Popped element is: "+poppedelement);

        int index= stack.search("Two");     //it returns that element is present in the stack or not it will return the position of element from the top of the stack
        System.out.println("the element 'Two' is found at index: "+index+stack.empty());


    }
}
