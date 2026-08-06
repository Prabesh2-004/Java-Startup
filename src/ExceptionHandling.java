// 1. CHECKED EXCEPTION (Inherits from Exception)
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    // Checked Exception: Compiler forces caller to handle or declare it
    static double withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Requested: $" + amount + ", Available: $" + balance);
        }
        return balance - amount;
    }

    // Unchecked Exception Example (Runtime Error)
    static int divide(int a, int b) {
        // ArithmeticException is UNCHECKED (inherits from RuntimeException).
        // No 'throws' declaration needed here!
        return a / b;
    }

    public static void main(String[] args) {

        // --- EXAMPLE 1: Handling Unchecked Exception (ArithmeticException) ---
        System.out.println("=== 1. Unchecked Exception Demo ===");
        try {
            int result = divide(10, 0); // Throws ArithmeticException at runtime
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Catching specific exception
            System.out.println("Handled Unchecked Error: Cannot divide by zero.");
        } finally {
            System.out.println("Division attempt complete.\n");
        }


        // --- EXAMPLE 2: Handling Checked Exception (InsufficientFundsException) ---
        System.out.println("=== 2. Checked Exception Demo ===");
        double currentBalance = 100.0;

        // Test Case A: Valid withdrawal
        try {
            currentBalance = withdraw(currentBalance, 60.0);
            System.out.println("Withdrawal successful! Remaining balance: $" + currentBalance);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        // Test Case B: Invalid withdrawal (Triggers Checked Exception)
        try {
            currentBalance = withdraw(currentBalance, 80.0); // 80 > 40 remaining balance
            System.out.println("Withdrawal successful! Remaining balance: $" + currentBalance);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}