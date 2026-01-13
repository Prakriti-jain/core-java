package OOPS;
/*
1. Encapsulation - we keep our data (variables) and methods (functions) inside a single unit called class.
                This is to restrict the direct access of the data and provide a controlled access through the methods.

                example : we have a coffee machine, we can get the coffee with the button press (methods)
                but we cant directly access or change the inside mechanism.
*/

class CoffeeMachine{
    private int coffeePowder = 10; //hidden inside

    public CoffeeMachine() {

    }
    public CoffeeMachine(int coffeePowder) {
        this.coffeePowder = coffeePowder;
    }

    public int getCoffeePowder() {
        return coffeePowder;
    }

//    public void setCoffeePowder(int coffeePowder) {
//        this.coffeePowder = coffeePowder;
//    }

    public void espresso(){
        if(coffeePowder > 0){
            coffeePowder--;
            System.out.println("expresso ready!");
        }else{
            System.out.println("refill coffee powder!!");
        }
    }


}

public class Encapsulation {
    public static void main() {
        CoffeeMachine coffee = new CoffeeMachine(2);
        CoffeeMachine coffee1 = new CoffeeMachine();
        System.out.println("Initial coffee powder: "+ coffee.getCoffeePowder());
        System.out.println("Initial coffee2 powder: " + coffee1.getCoffeePowder());


        coffee.espresso();

        System.out.println("Final coffee powder: "+ coffee.getCoffeePowder());

    }
}
