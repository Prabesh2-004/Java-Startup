package AccessModifiers;

import AccessModifiers.Package.Packages;

public class AccessModifiers {
    public static void main(String[] args) {
        Packages packages = new Packages();
        System.out.println(packages.score); // it can be access cause public can be access from any where
//        System.out.println(packages.marks); // cannot access cause it only be access by same class not from other class or packages
//        System.out.println(packages.balance); // cannot access cause it only be access by same class or subclass
//        System.out.println(packages.accountNumber); // cannot access cause it is not in same package
    }
}
