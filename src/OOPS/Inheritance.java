package OOPS;

/*
Inheritance - This means one class (child class) can use the properties and behaviors of another class (parent class).

example : We have animals which include some properties like sleep and eat, while another class Cat
and Dog has properties of sound, here Cat and Dog can use the properties of the class Animal.

*/

class Animal{
    void sleep(){
        System.out.println("sleeping");
    }

    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }
}




public class Inheritance {
    static void main() {
        Animal animal = new Animal();
        animal.eat();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
        cat.sleep();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();
    }
}
