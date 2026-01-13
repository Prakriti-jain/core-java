package StringsArrays;
/*
String  is an object which represents a sequence of characters. They are immutable(values cannot be changed
once created). String literals are stored in String Constant Pool(SCP), the syntax new String() creates a
new String object which is stored in heap memory. It is a nonprimitive data type

Comparison of strings has three ways
- == operator - it compares references and check memory location
- .equals() - compares content
- .compareTo() - this is for lexicographical comparison

Strings has a range of methods
- substring() - gives a part of string
- replace() - replaces characters or substrings
- split() - splits strings into arrays
- indexOf() - returns index of first occurrence.
- charAt() - gives the character at a particular index
 */

import java.util.Arrays;

public class strings {
    static void main() {
        String s1 = "Prakriti";
        String s2 = "Prakriti";
        //s1 and s2 points to the same objects [This is being done by SCP]

        String s = new String("Prakriti");
        // Above these are the ways to create a String

        //difference of == and equals
        System.out.println(s1==s); //this will give false since they both point to different references
        System.out.println(s1.equals(s)); //this will give true as equals check the value

        //methods in String
        //substring
        System.out.println(s.substring(1, 3)); //1 inclusive and 3 exclusive

        //replace
        System.out.println(s.replace('a', 'x'));

        //split
        System.out.println(Arrays.toString(s.split("k"))); //give two components Pra and riti

        //indexOf
        System.out.println(s.indexOf("a"));

        //charAt
        System.out.println(s.charAt(2));


    }
}
