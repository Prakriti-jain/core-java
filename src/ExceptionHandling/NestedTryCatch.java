package ExceptionHandling;

public class NestedTryCatch {
    static void main() {
        try{
            System.out.println("Outer try block");
            try {
                System.out.println("Inner try block");
                int a = 17/0; //this will cause ArithmeticException
            } catch (ArithmeticException e){
                System.out.println("Inner catch - " + e);
            }

            String str = "123aa";
            int num = Integer.parseInt(str); //This will give NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Outer catch - " + e);
        }
    }
}
