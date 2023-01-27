package LinkedList;

public class DoublyRunnerClass {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(20);
        list.insertFirst(2);
        list.insertFirst(90);
        list.insertFirst(6);
        list.insertFirst(3);

        list.insertLast(9);

        list.insertAfterValue(6,2099);
        list.display();
//        list.displayReverse();
    }
}
