package Collections.Set;

/*
HashSet extends AbstractSet and implements the Set interface, it uses hashtable for storage which stores information using hashing. A HashSet has only unique values. Methods provided by HashSet are
- add(obj) - adds the given object if not present. Elements in HashSet are not sorted.
- contains(obj) - checks if the element is present or not
- isEmpty() - checks if the set is empty or not
- remove(obj) - removes the given object
 */

import java.util.HashSet;

public class Hashset {
    static void main() {
        // creating a hash set
        HashSet set = new HashSet();
        // adding elements
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("E");

        System.out.println(set);

    }
}
