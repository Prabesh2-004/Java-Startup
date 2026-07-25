public class Recursion {
//    public static int factorial(int f) {
//        if(f <= 1) {
//            return 1;
//        }
//        return f * factorial(f - 1);
//    }

    public static int sum(int s) {
        if (s > 0) {
            return s + sum(s - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
//        int factorials = factorial(4);
//        System.out.println(factorials);
        int sums = sum(10);
        System.out.println(sums);
    }
}
