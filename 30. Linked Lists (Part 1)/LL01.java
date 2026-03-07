// Basic Linked List with its constructor
public class LL01{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // Creation of head and tail of the linked list
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        System.out.println("Basic Linked List with its constructor");
        // Creation of a linked list in a class 
        LL01 ll=new LL01();//the object creation means the ll is created
        ll.head=new Node(1);//the head of the linked list is created 
        // jisme data store ho gaya hai 1
        ll.head.next=new Node(2);// the next node is created after head
        // and then that node ka data store ho gaya hai 2

        //inseart delete edit sab karna hai to uske liye hum baar baar 
        // nahi likhenge ham methods bana lenge

        //linked list par sare operations methods se hi honge
    }
}