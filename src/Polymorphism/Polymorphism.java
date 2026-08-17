package Polymorphism;

// Superclass (Parent)
class A {
    public void show() {
        System.out.println("in class A");
    }
}

// Subclass B overrides show() method of class A
class B extends A {

////    public void showw() {
////        System.out.println("in class B"); // without "Override" it will run even though method name is not same
////    }


////    @Override
////    public void showw() {
////        System.out.println("in class B"); // with "Override it will show an error of method name doesn't exist.
////    }

    public void show() {
        System.out.println("in class B");
    }
}

// Subclass C overrides show() method of class A
class C extends A {
    @Override
    public void show() {
        System.out.println("in class C");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        /*
         * POLYMORPHISM SUMMARY FOR REVIEW:
         * --------------------------------
         * 1. What is happening?
         *    - Single reference variable 'obj' of type Superclass (A).
         *    - It holds references to different Subclass objects (A, B, C) at runtime.
         *
         * 2. How does JVM decide which show() to call? (Dynamic Method Dispatch)
         *    - Reference type (A) tells the compiler: "Is show() available in class A?"
         *    - Actual object type (new B() or new C()) tells the JVM at RUNTIME:
         *      "Execute the specific implementation inside this object."
         *
         * 3. Execution Flow:
         */

        // Points to class A object -> Calls A's show()
        A obj = new A();
        obj.show(); // Output: in class A

        // Reassigned to class B object -> Dynamically resolves to B's show()
        obj = new B();
        obj.show(); // Output: in class B

        // Reassigned to class C object -> Dynamically resolves to C's show()
        obj = new C();
        obj.show(); // Output: in class C
    }
}