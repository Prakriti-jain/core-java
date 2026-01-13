package DataTypes;
import java.util.*;

/*

Primitive data types - predefined by the language, there are 8 primitive data types
- byte - 8-bit signed 2's complement integer ; range is -2^7 to 2^7-1 ; used to save space in large arrays
- short - 16-bit signed 2's complement integer ; range is -2^15 to 2^15-1 ; can also be used to save space in large arrays
- int - 32-bit signed 2's complement integer ; range is -2^31 to 2^31-1
- long - 32-bit signed 2's complement integer ; range is -2^63 to 2^63-1
- float - single precision 32-bit IEEE 754 floating points ; default is 0.0f
- double - double precision 64-bit IEEE 754 floating points ; default is 0.0d
- boolean - two possible values true/false ; default is false
- char - single 16-bit Unicode character ; range is 0 to 65535

Reference data types - created using constructors of classes, they are used access object ;
default value is null ; stored in heap memory ;
they have associated methods like String have methods like indexOf(), length()

Example - Animal animal = new Animal("dog")
 */
class Datatypes {
    int num;
    public Datatypes(int num) {
        this.num = num;
    }

    @Override
    public String toString() { //toString helps in better printing of the reference objects
        return "Datatypes{" +
                "num=" + num +
                '}';
    }
}
public class data_types {
    static void main() {

        //Primitive Variables
        byte a = -68;
        System.out.println("byte: " + a);
        short b = 10087;
        System.out.println("short: " + b);
        int num = 239001;
        System.out.println("int: " + num);
        long n = 8_798_718_947_948_888_553L;
        System.out.println("long: " + n);
        float fl = 122.000003333f;
        System.out.println("float: "+fl);
        double db = 19543598.312362173500d;
        System.out.println("double: "+ db);
        boolean bool = false;
        System.out.println("boolean: "+ bool);
        char c = 'A';
        System.out.println("char: " + c); //will print A
        char d = 65;
        System.out.println("char: " + d); //will also print A

        //Reference Variables
        Datatypes dt = new Datatypes(8);
        System.out.println(dt);

        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println();

        //String input
        System.out.println("Enter string input- ");
        String s = sc.nextLine();
        System.out.println("string input: " + s);

        //int input
        System.out.println("enter two integer inputs- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("first integer input: "+ num1 + ", second integer input: "+num2);
    }

}


