package Collections.Map;
/*
HashMap uses hashtable to implement Map interface. It has constant time for basic operations
like get(), put() even for larger sets. Some common methods provided are -
- containsKey(key)
- containsValue(val)
- entrySet()
- get(key)
- remove()
- put(key, value)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    static void main() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(20, "Riya");
        map.put(1, "Aarya");
        map.put(30, "Rohit");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        System.out.println(set);

        map.remove(20);
        System.out.println(map);


    }
}
