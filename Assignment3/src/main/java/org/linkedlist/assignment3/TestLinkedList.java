// Test file for testing delete methods for Linked List //

public class TestLinkedList {
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.createSingleLinkedList(20);
        list.insertLinkedList(40,1);
        list.insertLinkedList(60,2);
        list.insertLinkedList(80,3);
        list.insertLinkedList(100,4);
        list.insertLinkedList(120,5);
        list.insertLinkedList(140,6);

        System.out.println("Original Linked List");

        printList(list); // Print the linked list, will implement later //

    }
}