package AccessModifiers;

import AccessModifiers.MainPackage.MainClass;

/*
Access Modifiers define how members of a class like variables, methods can be accessed from other parts of the program.
private - the methods or variables declared as private are accessible only within the class in  which they are declared
default - when no access modifier is present, it has default access modifier, it can be accessed only within the same package
protected - methods or variables declared as protected can be accessed within the same package and in different packages only if they are subclasses
public - methods or variables declared as public can be accessed from anywhere
*/

public class OutsideClass extends MainClass {
    public void display() {
//         System.out.println("Private value - "+ privateValue); // will throw error as direct access not allowed outside class
        System.out.println("Public value - "+ publicValue);
        System.out.println("Protected value - "+ protectValue);
//        System.out.println("Default value - "+ defValue);
    }
    static void main() {
        OutsideClass sub = new OutsideClass();
        sub.display();
    }
}
