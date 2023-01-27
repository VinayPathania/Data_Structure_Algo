package LinkedList;

// In doubly linked list you can move forward, and also you can move backward.
public class DoublyLL {

    private Node head;

    // In doubly linked list there are 3 fields present.
    // 1. its value
    // 2. reference to the next Node
    // 3. reference to the prev Node
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;

        node.next = null;
        if(head==null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfterValue(int after, int val){
        Node p =  find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }

    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayReverse(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            last = temp;
            temp = temp.next;
        }

        while(last!=null){
            System.out.print(last.val+" -> ");
           last = last.prev;
        }
        System.out.println("START");
    }



}
