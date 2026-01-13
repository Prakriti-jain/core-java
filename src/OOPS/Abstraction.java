package OOPS;
/*
2. Abstraction - This means hiding the internal implementation details and showing features that are
required by the users.
Abstraction includes two main things : 1. Abstract classes and 2. Interfaces
Abstract Class - partially built class which includes abstract methods(no body), normal methods(with bodies), variables and constructors
Interfaces - interface is like a contract which tells what methods to include, but it does not include the method body
The class inheriting the interface has to override the methods defined in that interface

example : we have a car, you press accelerator and car moves, but you don't really know how fuel
breakdown to produce energy and other internal stuffs.

*/

interface Payment {
    void pay(int amount);
}

class UPI implements Payment{
    @Override
    public void pay(int amount){
        System.out.println("paid " + amount + " using UPI");
    }
}


public class Abstraction {
    static void main() {
        Payment p = new UPI();
        p.pay(100);


    }
}
