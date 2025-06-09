// Test file for testing delete methods for Linked List //

package org.linkedlist.assignment3;


public class MyLinkedList {
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.createSingleLinkedlist(20);
        list.insertLinkedList(40,1);
        list.insertLinkedList(60,2);
        list.insertLinkedList(80,3);
        list.insertLinkedList(100,4);
        list.insertLinkedList(120,5);
        list.insertLinkedList(140,6);

        System.out.println("\nOriginal Linked List");

        printList(list);

        System.out.println("\nDelete from head (position 0):");
        list.delete(0);
        printList(list);

        System.out.println("\nDelete from tail (last position):");
        list.delete(list.size - 1);
        printList(list);

        System.out.println("\nDelete from middle (position 1):");
        list.delete(2);
        printList(list);

        System.out.println("\nDelete from invalid position (-1):");
        list.delete(-1);

        System.out.println("\nDelete from invalid position (size):");
        list.delete(list.size);

    }

    public static void printList(LinkedList list){
        if (list.head == null) {
            System.out.println("The list is empty.");
            return;
        }

        LinkedList.Node current = list.head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}