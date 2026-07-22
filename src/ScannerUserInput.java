import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter You name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        System.out.print("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Sum of you number is: " + (number1 + number2));
        System.out.println("Multiplication of you number is: " + (number1 * number2));

        System.out.print("Enter a temperature in Celsius: ");
        float temperature = scanner.nextFloat();
        float temFahrenheit = temperature * ((float) 9 /5) + 32;
        System.out.println("Your temperature in Fahrenheit is: " + temFahrenheit);
    }
}
