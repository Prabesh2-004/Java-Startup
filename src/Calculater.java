import java.util.Scanner;

public class Calculater {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextFloat();
        System.out.print("Choose operator (+, -, *, /, ^): ");
        String operators = scanner.next();
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextFloat();
        switch(operators) {
            case "+" -> System.out.println(firstNumber + secondNumber);
            case "-" -> System.out.println(firstNumber - secondNumber);
            case "/" -> System.out.println(firstNumber / secondNumber);
            case "*" -> System.out.println(firstNumber * secondNumber);
            case "^" -> System.out.println(Math.pow(firstNumber, secondNumber));
        }
    }
}
