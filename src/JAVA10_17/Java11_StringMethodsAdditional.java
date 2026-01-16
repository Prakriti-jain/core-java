package JAVA10_17;

/*
In Java 11 new features was added to check if the string is blank or not, also added strip()
to remove leading and trailing whitespaces along with Unicode characters.
 */

public class Java11_StringMethodsAdditional {
    static void main() {
        System.out.println("".isBlank());
        System.out.println("   ".isBlank());
        System.out.println(" PRAKRITI".isBlank());

        String a = "   abd   \u0041 ";
        System.out.println("Before using strip: "+a);
        System.out.println("After using Strip: "+a.strip());

        var name="chain ";
        System.out.println("Repeating jain 6 times: ");
        System.out.println(name.repeat(6));
    }
}
