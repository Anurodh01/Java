import java.util.*;
class Node
{
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data= data;
            this.next= null;
            this.prev= null;
        }
}
public class doublylinkedlist {
    public static Node createdoublylinkedlist(Node head)
    {
        int choice=1;
        Node tail= head;
        Scanner sc= new Scanner(System.in);
        while(choice == 1)
        {
            int data;
            System.out.println("Enter the data to insert in linked list");
            data= sc.nextInt();
            Node newnode= new Node(data);
            if(head == null )
            {
                head= tail = newnode;
            }
            else
            {
                tail.next= newnode;
                newnode.prev= tail;
                tail= newnode;
            }
        System.out.println("Do you want to continue (0/1");
        choice= sc.nextInt();
        }
    sc.close();
    return head;    
    }
    public void reverse(Node head)
    {
        
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
    public static void main(String args[])
    {
        Node head= null;
        head = createdoublylinkedlist(head);
        display(head);
    }
}

