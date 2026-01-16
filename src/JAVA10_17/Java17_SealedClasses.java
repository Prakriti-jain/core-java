package JAVA10_17;

/*
Sealed classes comes in between of final class and abstract class, A sealed class is a class that
restricts which other classes can extend or implement it.
final - no class can extend it
sealed - only specified classes can inherit
non sealed - free for inheritance for all
 */

sealed class Shape permits Circle, Square, Rectangle {
    void shape(){
        System.out.println("i am a shape!");
    }
}

final class Circle extends Shape {
    //no one can extend circle
}

sealed class Square extends Shape permits FilledSquare {
    //only filled square can extend square and no one
}

final class FilledSquare extends Square {
    //no one class extend filled square
}

non-sealed class Rectangle extends Shape {
    //anyone can extend rectangle
}


public class Java17_SealedClasses {
    static void main() {
        FilledSquare fs = new FilledSquare();
        fs.shape();
    }
}
