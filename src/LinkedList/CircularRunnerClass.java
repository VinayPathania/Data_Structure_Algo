package LinkedList;

public class CircularRunnerClass {
    public static void main(String[] args) {

        CircularLL list = new CircularLL();
        list.insert(3);
        list.insert(9);
        list.insert(5);
        list.insert(7);
        list.display();
        list.delete(9);
        list.display();

    }
}
