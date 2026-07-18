public class TypeCasting {
    public static void main(String[] args) {

        /*
            There are 2 types of type casting
            1. Widening Casting:
                Widening casting is done automatically when passing a smaller size type into a larger size type.
                This works because there is no risk of losing information. For example, an int value can safely fit inside a double.

            2. Narrowing Casting:
                Narrowing casting must be done manually by placing the type in parentheses () in front of the value.
                This is required because narrowing may result in data loss (for example, dropping decimals when converting a double to an int).
        */

        //Widening Casting
        int salary = 32445;
        double doubleSalary = salary;
        System.out.println(doubleSalary);

        // Narrowing Casting
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);


        // Real World Example


        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to double to make sure that the division is accurate */
        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's percentage is " + percentage);
    }
}
