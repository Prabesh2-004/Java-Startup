package AccessModifiers.Package;

public class Packages {
    private int marks = 10; // cannot be accessed outside the class
    public int score = 10; // can be accessed anywhere
    protected int balance = 100; // only subclass or same class can access this variable
    int accountNumber = 2_243_465; // can be accessed by same packages
}
