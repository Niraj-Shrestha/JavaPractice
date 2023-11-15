package DataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {
    public static void main(String[] args) {

        // Creating a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the front of the list
        linkedList.addFirst("Apple");
        linkedList.addFirst("Banana");
        linkedList.addFirst("Cherry");

        // Adding elements to the end of the list
        linkedList.addLast("Date");
        linkedList.addLast("Fig");

        // Inserting an element at a specific index
        linkedList.add(2, "Grape");

        // Displaying elements using an iterator
        Iterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(); // Separator

        // Removing the first element
        linkedList.removeFirst();

        // Removing the last element
        linkedList.removeLast();

        // Displaying elements in reverse order
        iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
