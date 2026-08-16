package SuperAndThis;

// why when creating object of B why A is also calling?? cause A is a super class of B it mean there is "super()" key what refer to super class which allow subclass to access parent class. "super()" is always there working invisibly in constructor.

// Default constructor will always call but if we need to call parameter passed constructor we need to pass parameter but Default will not be called so it help to call both at same time by using "this()" key

class A {
    public A() {
        super(); // It will always here not need to specify it we only need if we want to do some work with constructor.
        System.out.println("in A");
    }
    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
//        super(5); // if we want to call parameterize constructor we need to pass argument in "super()" key.
        System.out.println("in B");
    }
    public B(int n) {
        this(); // by using "thiS()" key we are calling both default and parameterize constructor
        System.out.println("in B int");
    }
}

public class SuperAndThis {
    public static void main(String[] args) {
        B b = new B(5);  // both "in A" and "in B" will print.
    }
}
