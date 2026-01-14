package Collections.List;
/*
LinkedList Class extends AbstractSequentialList and implements List Interface. It is used for
linked list data structures. Some common methods provided are -
- add(index, ele) - inserts element at given index
- addAll(collection) - appends all the elements in the given collection
- contains(obj) - checks if the given object is present or not
- get(index) - returns the element at given index
- remove(index) - removes element at given index
 */

import java.util.LinkedList;

public class LinkedLists {
    static void main() {
        // creating a linked list
        LinkedList list = new LinkedList();
        // adding elements
        list.add("A");
        list.add("B");
        list.add("D");
        System.out.println(list);

        //adding last element
        list.addLast("Z");


        //adding first element
        list.addFirst("J");

        System.out.println(list);

        //adding at a specified position
        list.add(1, "A2");
        System.out.println(list);

        // removing elements
        list.remove("D");
        list.remove(2);
        System.out.println(list);

        // removing first and last elements
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
