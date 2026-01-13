package OOPS;

/*
4. Polymorphism - This means that the same funtion gives different output depending on the object that calls it.

 Two main concepts in polymorphism : 1. Method Overriding and 2. Method Overloading

1. Method Overloading (Compiletime polymorphism) : It include same method name but different parameters, java decide which one to call during compile time.
2. Method Overriding (Runtime Polymorphism) : In this child class changes parent's method, in java this is decided during runtime.

example : We have animals like Dog, Cat, Cow. when we use the method sound() for them each one of them will give
different output like Bark, Meow, Moo accordingly.
*/

class Animal2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat2 extends Animal2{
    void sound() {
        System.out.println("Cat meows!!");
    }
}

class Dog2 extends Animal2 {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal2 a = new Dog2();   // parent reference, child object
        a.sound();              // Dog barks

        Animal2 cat = new Cat2();   // parent reference, child object
        cat.sound();              // Cat meows
    }
}