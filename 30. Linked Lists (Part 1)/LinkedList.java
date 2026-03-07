public class LinkedList{
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
    public static int size;// static by default value is 0

    public void addFirst(int data){
        size++;
        //this adds element at the beginning of the linked list
        // thus 1st becomes 2nd and new become 1st and 2nd becomes 3rd and so on
        //step 1 - create a new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        //step 2 - newNode next = head
        newNode.next=head;//link

        //step3 - head=newNode
        head=newNode;
    }

    public void addLast(int data){
        size++;
        // this adds element at the end of the linked list
        //thus starting element remains same and new element becomes last elements
        //step 1 - create a new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }        
        
        //Step 2 - tail next = newNode
        tail.next=newNode;//link

        //step 3 - tail = newNode
        tail=newNode;
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
    public void addMid(int idx,int data){
        //here we will add element at the given index
        //such that the ll adds element at any given index and the element 
        // at that index becomes next element of the new node and the new 
        // node becomes next element of the previous node
        if(idx==0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //if i=idx-1 then temp-> previous node
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // prev: i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){//O(n)
        Node temp=head;
        int i=0;
        while (temp !=null){
            if(temp.data==key){//key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        // key not found
        return -1;
    } 
    //helper function for recursive search
    public int helper(Node head,int key){//O(n)
        //base case
        if (head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        //here we will use recursion to search the key in the 
        // linked list as here only one parameter is there so 
        // we can't use recursion with this parameter so we use
        // helper function
        return helper(head,key);
    }

    public void reverse(){//O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        //if head ko delete krna hai
        if(n==sz){
            head=head.next;//remove first
            return;
        }
        //other than head ko delete krna hai
        //sz-n
        int i=1;//head pehle hi delete ho jayega to i=1 se start karenge
        int idxToFind=sz-n;
        Node prev=head;
        while(i<idxToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //slow and fast approach to find mid of the linked list
    public Node findMid(Node head){//helper function to find mid of the linked list
        Node slow =head;
        Node fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is my mid node
    }

    public boolean cheackPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step 1 - find mid
        Node midNode=findMid(head);

        //step 2 - reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//right half head
        Node left=head;
        //step 3 - check if left half and right half are equal
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        // ll.addFirst(2);// 2
        // ll.printLL();
        // ll.addFirst(1);// 1 , 2
        // ll.printLL();
        // ll.addLast(3);  // 1 , 2 , 3
        // ll.printLL();
        // ll.addLast(4);// 1 , 2 , 3 , 4
        // ll.printLL();

        // ll.addMid(2,9);// 1 , 2 , 9 , 3 , 4
        // ll.printLL();
        // ll.removeFirst();// 2 , 9 , 3 , 4
        // ll.printLL();
        // ll.removeLast();// 2 , 9 , 3
        // ll.printLL();
        // System.out.println("Size of the linked list is : "+ll.size);
        // System.out.println("Index of 9 is : "+ll.itrSearch(9));
        // System.out.println("Index of 10 is : "+ll.itrSearch(10));
        // System.out.println("Index of 9 is : "+ll.recSearch(3));
        // System.out.println("Index of 10 is : "+ll.recSearch(10));
        // ll.reverse();
        // ll.printLL();// 3 , 9 , 2
        // ll.addFirst(1);// 1 , 3 , 9 , 2
        // ll.addMid(1,2);// 1 , 2 , 3 , 9 , 2
        // ll.printLL();// 1 , 2 , 3 , 9 , 2
        // ll.deleteNthfromEnd(1);// 1 , 2 , 3 , 9
        // ll.printLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1); // 1 , 2 , 2 , 1
        ll.printLL();
        System.out.println(ll.cheackPalindrome());// true
    }
}