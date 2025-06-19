

public class UndoRedo<T> {

    private class Node {
        T data; //Allows us to store any type of data type //
        Node prev, next;

        Node(T data) {
            this.data = data;
        }

    }

    private Node head; // Points to the start of the list //
    private Node current; // Points to the current position in the list //


}


