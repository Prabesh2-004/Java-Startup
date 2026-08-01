import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        while (userInput != randomNumber) {
            System.out.print("Enter a number: ");
            userInput = scanner.nextInt();
            if(userInput > randomNumber) {
                System.out.println("Too High!");
            }else if (userInput < randomNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("You got it");
            }
        }
    }
}
