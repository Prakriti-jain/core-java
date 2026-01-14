package Collections.Set;
/*
TreeSet uses Set interface for implementation and for storage it uses tree which stores the elements in sorted and ascending order. It has fast access, so tree set is used when elements  need to stored in sorted order.
Methods provided are -
- add(obj) - adds the given object if not present
- contains(obj) - checks if the element is present or not
- isEmpty() - checks if the set is empty or not
- remove(obj) - removes the given object
 */

import java.util.TreeSet;

public class Treesets {
    static void main() {
        // creating a tree set
        TreeSet set = new TreeSet();
        // adding elements
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("E");

        System.out.println(set);
    }
}
