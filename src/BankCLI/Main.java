package BankCLI;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static double deposit() {
        double amount;

        System.out.print("Enter an amount you wanna deposit: ");
        amount = scanner.nextDouble();

        if(amount <= 0) {
            System.out.println("Invalid amount");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;

        System.out.print("Enter an amount you wanna withdraw: ");
        amount = scanner.nextDouble();

        if(amount <= 0) {
            System.out.println("Invalid amount");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
            return 0;
        } else {
            return amount;
        }
    }

    public static void main(String[] args) {
        double totalBalance = 0;
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*******************");
            System.out.println(" Banking Program ");
            System.out.println("*******************");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> totalBalance += deposit();
                case 2 -> totalBalance -= withdraw(totalBalance);
                case 3 -> System.out.println("Your total balance: " + totalBalance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid");
            }
        }

    }
}
