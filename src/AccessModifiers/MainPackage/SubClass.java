package AccessModifiers.MainPackage;

public class SubClass extends MainClass {
    public void display() {
        // System.out.println("Private value - "+ privateValue); will throw error as direct access not allowed outside class
        System.out.println("Public value - "+ publicValue);
        System.out.println("Protected value - "+ protectValue);
        System.out.println("Default value - "+ defValue);
    }
    static void main() {
        SubClass sub = new SubClass();
        sub.display();
    }
}
