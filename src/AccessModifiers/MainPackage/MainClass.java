package AccessModifiers.MainPackage;

public class MainClass {
    public int publicValue = 100;
    private int privateValue = 12;
    protected int protectValue = 19;
    int defValue = 20;

    public void show() {
        System.out.println("Private value - "+ privateValue);
        System.out.println("Public value - "+ publicValue);
        System.out.println("Protected value - "+ protectValue);
        System.out.println("Default value - "+ defValue);
    }

}
