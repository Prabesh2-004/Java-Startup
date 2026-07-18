public class MathInJava {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 64;
        int d = -14;
        int randomValue = (int) (Math.random() * 101);

        System.out.println(Math.max(a,b)); // get maximum value
        System.out.println(Math.min(a,b)); // get minimum value
        System.out.println(Math.sqrt(c)); // get square root
        System.out.println(Math.abs(d)); // get absolute true value
        System.out.println(Math.pow(a, b)); // power value a by b
        System.out.println(Math.floor(4.6)); // always convert to base value
        System.out.println(Math.ceil(4.4)); // always convert to max value base value + 1
        System.out.println(Math.round(4.6)); // always convert near value
        System.out.println(randomValue); // always convert near value
    }
}
