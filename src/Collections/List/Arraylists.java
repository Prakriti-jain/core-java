package Collections.List;
import java.util.Collections;

/*
Java has a set of standard collection classes that implement Collection interfaces, some of these
classes provide full implementation while some are abstract classes. The standard collection classes
are - AbstractCollection, AbstractList, AbstractSequentialList, LinkedList, ArrayList etc.

ArrayList is a resizable array implementation of the List interface using class java.util.ArrayList. They dynamically grow and shriink dynamically.
They have fast random using index(zero based)

Methods in ArrayList
- get(index)
- add(ele)
- add(index, ele)
- remove(index)
- search
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylists {
    public static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        //accessing elements
        int num = numbers.get(0);
        System.out.println(num);

        //updating elements
        numbers.set(0, 100);
        System.out.println(numbers);

        //removing elements
        numbers.remove(1); //removes by index
        System.out.println(numbers);

        //sorting arraylists using Collections class
        Collections.sort(numbers);

        //Iterating ArrayLists using Iterator

        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());

        }


    }
}
