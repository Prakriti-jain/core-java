package Streams;

/*
Common types of Functional Interfaces -
- Predicate<T> - test a boolean condition on T. It has a boolean function test(T, t)
- Function<T, R> - transform T into R.  It has a function R apply(T t)
- Consumer<T> - performs an action on T ; does not return anything ; void accept(T, t)
- Supplier<T> - provides a T (no input) ; T get()
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.prefs.Preferences;

public class FunctionalInterfacesExamples {
    static void main() {
        //PREDICATE

        //without lambda
        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };

        //with lambda
        Predicate<Integer> isEven1 = integer -> integer%2==0;
        System.out.println("checking if even using Predicate (without lambda) - " + isEven.test(1004));
        System.out.println("checking if even using Predicate (with lambda) - " + isEven1.test(1004));


        //FUNCTION
        Function<String, char[]> convertStringtoCharArray = str -> {
            char[] ch = str.toCharArray();
            return ch;
        };
        System.out.println("converting str to char Array using Function - " + Arrays.toString(convertStringtoCharArray.apply("Prakriti")));


        //CONSUMER
        Consumer<Integer> print = n -> System.out.println("Printing a number using Consumer - " + n);
        print.accept(12);

        //SUPPLIER
        Supplier<Character> random = () -> (char) (65+ (int)(Math.random()*10));
        System.out.println("Printing a random character using Supplier - " + random.get());


        //EXAMPLE
        /*
        Supplier - gives a number 10
        Predicate - checks if it is Even
        Function - converts the number to string
        Consumer - print the string
         */

        Supplier<Integer> num = ()->10;
        Predicate<Integer> check = n -> n%2==0;
        Function<Integer, String> func = n -> "Number - " + n;
        Consumer<String> p = str -> System.out.println(str);

        if(check.test(num.get())) {
            p.accept(func.apply(num.get()));
        }

    }

}
