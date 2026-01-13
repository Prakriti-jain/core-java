package StringsArrays;
import java.util.*;

/*
Arrays are objects that store multiple variables of the same type. Arrays are stored in heap.
Arrays are fixed sized, they have index based access (which starts from 0), they store homogeneous data
Since arrays have index based access they are fast
There are two types of arrays - single dimensional arrays (1D) and multidimensional arrays (2D or higher)
Elements of arrays can be easily accessed and modified.

There are also many methods for arrays via the class java.util.Arrays -
- Arrays.toString() -  Converts array to readable string
- Arrays.sort() -  sort array in ascending order
- Arrays.copyOf() - creates copy of arrays
- Arrays.equals() - compares content of two arrays
etc
 */
public class arrays {
    static void main() {
        //declaration of arrays
        int[] arr;

        //allocation of arrays
        arr = new int[3];

        //initialization of arrays
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;

        //we can also declare and initialize arrays in a single line as well
        boolean[] bool = {false, true, false};

        //Accessing and Modifying Elements
        arr[1] = 100;
        System.out.println(arr[1]); //value has been changed from 2 to 100

        //Methods in Arrays
        //.toString()
        System.out.println(Arrays.toString(arr));

        //.sort()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //this time will print in ascending order

        //.copyOf()
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copy));

        //.equals()
        int[] arr2 = {1, 3, 4};
        boolean check = Arrays.equals(arr, arr2); //will print false
        System.out.println(check);

    }


}
