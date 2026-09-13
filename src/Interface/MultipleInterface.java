package Interface;

interface FirstInterface {
    void myMethod();
}

interface SecondInterface {
    void myOtherMethod();
}

// if we implement many interface it will be necessary to call method of all interface else it will cause an error code will not run at all.

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
