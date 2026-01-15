package JAVA8;

/*
Static methods belongs to the class itself instead to a specific object. They can be called
without creating any instance.
 */
class Example {
    static void method() {
        System.out.println("This is a static method");
    }
}

public class StaticMethods {
    static void main() {
        Example.method(); //directly called method without creating an instance of Example class
    }
}
