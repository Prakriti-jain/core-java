package ExceptionHandling;

/*
Custom Exception is defined by the user to handle specific requirements. These exceptions extend the Exception class (for checked exceptions) or RuntimeException Class (for unchecked exceptions)
 */

import java.util.Scanner;

public class CustomExceptions {
    static void main() {
        System.out.println("Enter a number - ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if(age<18) {
                throw new InvalidAgeException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class InvalidAgeException extends Exception {
    @Override
    public String toString() {
        return super.toString() + " This is toString()";
    }

    @Override
    public String getMessage() {
        return "Age must be >= 18";
    }
}
