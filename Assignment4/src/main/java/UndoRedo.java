

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

    public void addState(T state){
        Node newNode = new Node(state);

        if (head == null) {
            head = newNode;
            current = head;
        } else{
            if (current != null) current.next = null;

            newNode.prev = current;
            if (current != null) current.next = newNode;
            current = newNode;
        }
    }

    public T undo() {
        if (current != null && current.next != null) {
            current = current.next; // Move to the next state
            return current.data; // Return the data of the new current state
        }
        return null;
    }

}






