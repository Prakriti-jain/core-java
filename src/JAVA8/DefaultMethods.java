package JAVA8;

/*
In Java 8, interfaces can include concrete methods using the default keyword.
Through this we can create new methods to interfaces without breaking existing implementations
 */

interface Vehicle {
    default void honk(){
        System.out.println("Beep!");
    }
}

class Car implements Vehicle{
    //no need to override, inherits default methods
}

class Bus implements Vehicle {
    @Override
    public void honk() {
        System.out.println("This is a bus!");
    }
}

public class DefaultMethods {
    static void main() {
        Vehicle car = new Car();
        car.honk();

        Vehicle bus = new Bus();
        bus.honk();
    }
}
