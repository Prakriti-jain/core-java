package JAVA10_17;

/*
Earlier, we needed to explicitly check the type of the object using instanceOf and then perform
the cast to use its methods and properties. Scope of the variable in this case is limited to the
block only. Using Enhanced instanceOf, Java combines type checking and type casting in one step.
So whenever the condition is true, it automatically casts the object
 */

public class Java17_EnhancedInstanceOf {
    static void main() {
        Object obj = "Helloo";

        //without enhanced instance of
        if(obj instanceof String) {
            String s = (String) obj;
            System.out.println(s);
        } else System.out.println("Not a string");


        //with enhanced instance of
        Object obj1 = "Helloooooo";
        if(obj1 instanceof String) {
            System.out.println(obj1);
        } else System.out.println("Not a string again");
    }
}
