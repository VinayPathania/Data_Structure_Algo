package LinkedList;

public class RunnerClass {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertFirst(7);

        list.insertLast(99);

        list.insertFirst(200);
        list.display();
    }
}
