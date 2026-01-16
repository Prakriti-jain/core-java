package JAVA10_17;

/*

 */

public class Java17_PatternMatching {
    public static String describe(Object obj) {
        //using switch to know the type of the object
        return switch(obj) {
            case Integer i -> "it is integer";
            case String s -> "it is string";
            case null -> "it is null";
            default -> "Cannot know the type";
        };
    }
    static void main() {
        System.out.println(describe("hello"));
        System.out.println(describe(123));
        System.out.println(describe(null));
        System.out.println(describe(1.2222));
    }
}
