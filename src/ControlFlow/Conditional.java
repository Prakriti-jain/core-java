package ControlFlow;

/*
Control Flow statements allows to control the order in which instructions are executed in a program
Types of Control Flow Statements -
- Conditional Statements
  - if else
  - switch case

- Looping Statements
  - for
  - while
  - do-while

- Jump Statements
  - return
  - break
  - continue
 */

public class Conditional {
    static void main() {
        // if-elseif-else
        int a = 17;
        if (a == 12) {
            System.out.println("a is equal to 12");
        } else if (a == 13) {
            System.out.println("a is equal to 13");
        } else {
            System.out.println("a is not equal to 12 or 13");
        }


        //switch case
        switch(a) {
            case 12:
                System.out.println("a is equal to 12");
                break;
            case 13:
                System.out.println("a is equal to 13");
                break;
            default:
                System.out.println("a is not equal to 12 or 13");
        }
    }


}
