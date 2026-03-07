public class LL1 {   
    //Floyd's Tortoise and Hare Algorithm
    //Floyd's Cycle FInding (Detection) Algorithm
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow==fast){
                return true;//cycle exists
            }
        }
        return false;//cycle does not exist
    }

    //remove cycle from the linked list
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast =head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;//no cycle
        }
        //find meeting point
        slow=head;
        Node prev=null;//last node of the cycle
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle -> last.next=null
        prev.next=null;
    }
    public static void main(String[] args) {
        //foring a cycle in the linked list
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;//cycle formed
        //1 -> 2 -> 3 --> 2
        System.out.println(isCycle());//true
        removeCycle();
        System.out.println(isCycle());//false
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
    }
    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        } else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
    }
    public static void removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }else if (size==1){
            head=tail=null;
            size=0;
            return;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
         tail=temp;
         size--;
    }
    
}