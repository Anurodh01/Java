import java.io.*;
// import java.util.*;
class Node
{
    public int data;
    public Node next;
    public Node(int data)
    {
        this.data= data;
        this.next= null;
    }
}
public class LinkedListSorting {
    public static Node CreateLinkedList(Node head)
    {
        try{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            int data;
            System.out.println("Enter the data to be inserted in linked list");
            data=Integer.parseInt(br.readLine());
            if(data == -1)
            break;
            Node newnode= new Node(data);
            if(head== null)
            {
                head= newnode;
            }
            else{
                Node temp=head;
                while(temp.next!=null)
                {
                    temp= temp.next;
                }
                temp.next= newnode;
            }
        }
        }
        catch(Exception e)
        {}
        return head;
    }
    public static void display(Node head)
    {
        Node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
    public static Node Merge(Node l1, Node l2)
    {
        //first create a dummynode
        Node dummynode= new Node(-1);
        Node current= dummynode;

        while(l1!=null && l2!=null)
        {
            if(l1.data < l2.data)
            {
                current.next= l1;
                l1= l1.next;
            }
            else{
                current.next= l2;
                l2= l2.next;
            }
            current= current.next;
        }
        //for the unequal length linked lists
        if(l1!=null)
        {
            current.next= l1;
        }
        if(l2!=null)
        {
            current.next= l2;
        }
        return dummynode.next;
    }
    public static Node MergeSort(Node head)
    {
        if(head== null || head.next== null)
        {
            return head;
        }
        Node temp= null;
        Node slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null)
        {
            temp= slow;
            slow = slow.next;
            fast= fast.next.next;
        }
        temp.next= null;
        //now divide and merge linked lists

        Node l1= MergeSort(head);
        Node l2= MergeSort(slow);

        return Merge(l1, l2);
    }
    public static void main(String args[])
    {
        Node head= null;
        head= CreateLinkedList(head);
        display(head);
        head= MergeSort(head);
        System.out.println("\nAfter sorting the linked list: ");
        display(head);
    }
}
