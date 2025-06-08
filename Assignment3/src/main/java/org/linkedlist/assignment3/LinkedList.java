package org.linkedlist.assignment3;

import java.util.LinkedList;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedlist(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert Method

    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createSingleLinkedlist(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;

        } else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }

    }

    public void delete(int position){

        if (head == null) {
            System.out.println("List is empty");
        }

        // If position is out of bounds, print that it is //
        if (position < 0 || position >= size){
            System.out.println("Invalid position.");
        }


        // If head is 0: update head to next node //

        if (position == 0) {
            head = head.next;
            size--;

            if (size == 0){
                tail = null;
                return;
            }

        }


        Node currentNode = head;
        //Loops through before the one to delete //
        for(int i = 0; i < position - 1; i++){
            currentNode = currentNode.next;
        }

        // Skips over the node we want to delete and links to the next one //
        currentNode.next = currentNode.next.next;

        // Update tail to point to new last node as the old tail is now removed //
        if (position == size - 1) {
            tail = currentNode;
        }

        size --;
    }

}