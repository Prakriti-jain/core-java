package JAVA8;

/*
Functional Interface is an interface that has exactly one abstract method. It can have as
many default and static methods. These are annotated with @FunctionalInterface. It enables
Lambda expressions.
 */


@FunctionalInterface
interface Greetings {
    void sayHello();
}

interface Calculator {
    int operate(int a, int b);
}

public class FunctionalInterfaces {
    static void main() {
        //EXAMPLE - 1
        //without lambda expression
        Greetings g = new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("hii without lambda");
            }
        };

        //with lambda expression
        Greetings gg = () -> {
            System.out.println("hii with lambda");
        };

        g.sayHello();
        gg.sayHello();


        //EXAMPLE - 2
        Calculator add = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        };

        Calculator mul = (a, b) -> { return a*b; };

        System.out.println(add.operate(2, 3));
        System.out.println(mul.operate(2, 3));

    }
}
