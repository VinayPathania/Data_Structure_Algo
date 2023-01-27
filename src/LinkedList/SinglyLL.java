package LinkedList;

public class SinglyLL {
    // head: it's a reference variable to the first element of LinkedList.
    // tail: reference variable to the last element of LinkedList.
    // size: variable denoting size of the LinkedList.


    private Node head;
    private Node tail;
    private int size;

    public SinglyLL() {
        this.size = 0;
    }


    // Node class for every single value present in the LinkedList
    // Every Node contain 2 fields :
    // 1. its value.
    // 2. reference to the next Node.
    private class Node{
       int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


//    METHODS
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void insertLast(int val){
        if(tail==null){
         insertFirst(val);
         return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    public void insertAtIndex(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = getNode(size-2);
        int value = tail.val;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public Node getNode(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteAtIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = getNode(index-1);

        prev.next = prev.next.next;
        return prev.next.val;
    }



    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+ " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
