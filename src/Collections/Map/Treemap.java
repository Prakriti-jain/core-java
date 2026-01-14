package Collections.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
TreeMap uses tree to implement Map interface. Unlike HashMap, TreeMap guarantees that the key value
pairs are sorted in ascending order.
Some common methods provided are -
- containsKey(key)
- containsValue(val)
- entrySet()
- get(key)
- remove()
- put(key, value)
 */

public class Treemap {
    static void main() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(20, "Riya");
        map.put(1, "Aarya");
        map.put(30, "Rohit");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        System.out.println(set);

        map.remove(20);
        System.out.println(map);
    }
}
