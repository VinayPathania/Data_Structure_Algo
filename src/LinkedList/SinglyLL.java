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
        private int val;
        private Node next;

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



    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+ " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
