package AccessModifiers.Package;

class B extends Packages {
    public void balance() {
        System.out.println(balance);
    }
}

public class A {

    public void marks() {
        Packages packages = new Packages();
        System.out.println(packages.score);
    }
}
