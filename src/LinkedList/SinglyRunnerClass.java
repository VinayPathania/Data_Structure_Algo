package LinkedList;

public class SinglyRunnerClass {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertFirst(7);

        list.insertLast(99);

        list.insertFirst(200);

        list.insertAtIndex(100,3);


        list.display();

        System.out.println(list.deleteFirst() + " -> Deleted");


        System.out.println(list.deleteLast());

        System.out.println(list.deleteAtIndex(3));

        list.display();
    }
}
