import java.util.Scanner;

public class Methods {
    static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first value: ");
        int valueA = scanner.nextInt();
        System.out.print("Enter your second value: ");
        int valueB = scanner.nextInt();
        System.out.println(add(valueA, valueB));
    }
}
