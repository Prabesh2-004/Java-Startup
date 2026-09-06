package Interface;

// interface is same as a public absract class like below
//abstract class A {
//    public abstract void show();
//}

//interface A {
//    void show();
//}
// both class and interface are same doing same thing, but we don't need to manually write abstract like in above class and in interface every method automatically become public abstract not need to explicitly say public abstract like in above class.

interface A {
    public void show();
    public void config();
}

// instead in extending we use "implements" word to use interface methods. once we use implements word in class we need to call interface methods in class if forget to call that class will become abstract class as well.
class B implements A {
    public void show() {
        System.out.println("In show");
    }
    public void config() {
        System.out.println("In config");
    }
}

public class Interface {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.config();
    }
}
