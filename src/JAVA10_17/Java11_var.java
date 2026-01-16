package JAVA10_17;

/*
var in Java is a local variable type inference. This means that we don't need to write the type
on the left side. the compiler infer the type from the right hand side. It was introduced in
java 10 and fully available in java 11.
var cannot be used
- fields
- method parameters
- method return types
 */

import java.util.List;

public class Java11_var {
    static void main() {
        var name = "Prakriti";
        var age = 20;
        var list = List.of(1,2,4);

        System.out.println(name + " " + age);
        System.out.println(list);

        // example
        for(var n : list) {
            System.out.println(n*n);
        }

    }
}
