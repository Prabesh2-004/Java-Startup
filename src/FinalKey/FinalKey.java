package FinalKey;

//final class Calc {
class Calc {
//    public void show() {
//        System.out.println("By Prabesh"); // it can be used and modify any ware so we need to use final key to stop it from happening
//    }
    public final void show() {
        System.out.println("By Prabesh");
    }
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc { // user can extend a class if we use final it cannot be extended in any class we are stoping from inheritance  extended
//    public void show() {
//        System.out.println("By Adam"); // after final, it cannot be used
//    }

//    public void show() {
//        System.out.println("By Adam"); // editor is taking credit even thought it is my method so to stop it we can use final key in method as well
//    }
    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}

public class FinalKey {
    public static void main(String[] args) {
//        double pi = 3.14;
//        pi = 2.22; // pie value is always constant it will never change but I can be change we need to use final key to stop it from changing.
        final double pi = 3.14;
//        pi = 2.22; // if we try to midify it, it will show an error.
        System.out.println(pi);

        Calc calc = new Calc();
        calc.show();
        calc.add(3,5);
    }
}
