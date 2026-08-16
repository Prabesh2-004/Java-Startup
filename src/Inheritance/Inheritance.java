package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Calculator is a parent class which only perform add and sub. AdvCalculator is a child class that extends Calculator can perform add, sub, multi and div. And VeryAdvCalculator is a child class of AdvCalculator what can perform all task add, sub, multi and div but has one extra feature which is this class can perform to get power of number.
        
        VeryAdvCalculator calculator = new VeryAdvCalculator();

        System.out.println(calculator.add(2,3));
        System.out.println(calculator.sub(4,3));
        System.out.println(calculator.multi(3,3));
        System.out.println(calculator.div(6,3));
        System.out.println(calculator.power(4,2));
    }
}
