package JAVA8;

interface Greeting {
    void sayHello();
    String getName();
}

public class AnonymousInnerClass {
    static void main() {
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hi, greetings");
            }

            @Override
            public String getName() {
                return "My name is Prakriti";
            }
        };

        greet.sayHello();
        System.out.println(greet.getName());
    }
}
