package JAVA8;

import java.util.*;


/*
Java-8 has many key features
- Lambda Expressions
- Functional Interfaces
- Stream API
- Optional
- Date and Time API
- Method Preferences

Syntax of lambda functions -
Animal dog =() -> {
   return "It is a dog";
   }

IS SAME AS -

Animal dog = new Animal(){
    @Override
    public String getName(){
        return "It is a dog";
    }
};

 */


public class LamdaExp {
    static void main() {
        List<String> list1 = new ArrayList<>(Arrays.asList("Helloooooooooo", "World","blast by trump"));
        list1.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println(list1);

        List<String> list2 =  new ArrayList<>(Arrays.asList("Hello", "World","blast by trump"));
        list2.sort((s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(list2);
    }
}
