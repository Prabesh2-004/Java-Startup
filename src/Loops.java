public class Loops {
    public static void main (String[] args) {
        // For loop
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ". Hello World!");
        }

        // while Loop
        int z = 1;
        while (z <= 100) {
            System.out.println(z + ". Hello World!");
            z++;
        }

        // Do-While Loop
        int y = 1;
        do {
            System.out.println(y + ". Hello World!");
            y++;
        } while (y <= 100);
    }
}
