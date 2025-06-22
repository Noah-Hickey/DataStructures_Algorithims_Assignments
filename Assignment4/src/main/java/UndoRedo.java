

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

    public void addState(T state) {

        // Checks if state is null //
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null");
        }

        Node newNode = new Node(state);

        if (head == null) {
            head = newNode;
            current = head;
        } else {
           clearFutureStates();

            newNode.prev = current;
            if (current != null) current.next = newNode;
            current = newNode;
        }
    }

    private void clearFutureStates() {
        if (current != null) {
            current.next = null; // Clear future states when adding a new state //
        }
    }

    // Undo and Redo Methods //
    public T redo() {
        if (current != null && current.next != null) {
            current = current.next; // Move to the next state //
            return current.data; // Return the data of the new current state //
        }
        return null; // No previous states to undo //
    }

    public T undo() {
        if (current != null && current.prev != null) {
            current = current.prev; // Move to the previous state //
            return current.data; // Return the data of the new current state //
        }
        return null; // No next states to redo //
    }

    public T getCurrentState() {
        return current != null ? current.data : null; // Return the data of the current state //
    }


    // Checks if the operation can be done //
    public boolean canUndo() {
        return current != null && current.prev != null;
    }

    // Checks if the operation can be done //
    public boolean canRedo() {
        return current != null && current.next != null;
    }

    public int getRedoCount() {
        int count = 0;
        Node temp = current;
        while (temp != null && temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

     //Clears all states and resets the undo-redo system. //
    public void clear() {
        head = null;
        current = null;
    }


    // Boolean for if there are no states in the system //
    public boolean isEmpty() {
        return head == null;
    }

    // Prints all states in the system //
    public void printStates() {
        if (head == null) {
            System.out.println("No states available");
            return;
        }

        Node temp = head;
        System.out.print("States: ");
        while (temp != null) {
            if (temp == current) {
                System.out.print("[" + temp.data + "] ");
            } else {
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

}






