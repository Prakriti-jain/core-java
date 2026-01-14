package ExceptionHandling;

/*
Exception Handling is used to handle runtime error, allowing normal flow of a program to continue. Exceptions are events that occur during program execution that disrupt the normal flow of instructions
try block - contains code that might throw an exception
catch block - handles the exception if it occurs
finally block - it is executed whether an exception is thrown or not

Checked Exception - These are the exceptions checked at compile time, that is a programmer needs to handle them explicitly
Unchecked Exception -These exceptions are checked at runtime and do not require explicitly handling at compile time.
 */
public class Exceptions {
    static void main() {
        //basic try-catch-finally
        int[] numbers = {1, 2, 3, 5};
        try {
            System.out.println(numbers[6]); //this will throw ArrayOutOfBoundsException
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This block will run always");
        }


        //multi-catch
        try {
            String str = "123a";
            int num = Integer.parseInt(str);
            System.out.println(numbers[5]);
            System.out.println(numbers[2]/0);
        } catch(ArithmeticException e) {
            System.out.println("Exception caught - " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught - " + e);
        } catch(NumberFormatException e) {
            System.out.println("Exception caught - " + e);
        }
    }
}
