public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Arithmetic Operators
        int sum = a + b; //  add two variables
        int mult = a * b; // multiply 2 variables
        int sub = a - b; // subtract 2 variable
        double div = (double) a / b; // divide numerator by denominator
        int modulus = a % b; // get reminder after divide
        int increment = 1;
        increment++;
        ++increment;
        int decrement = 3;
        decrement--;
        --decrement;

        System.out.println(sum + " " + mult + " " + sub + " " + div + " " + modulus + " " + increment + " " + decrement);

        // Different between post increment i++ vs pre increment ++i or same as decrement

        int x = 3;
        int y = ++x;
        System.out.println(y); // output is 4, why? cause value of x increase before x value assign to y.

        int m = 3;
        int k = m++;
        System.out.println(k); // output is 3, why? cause value increase after m assign to k so m already assign as 3 so it will become 3.


        // Assignment Operators

        int f = 5;
        // Taking f value from parent where initialize not from previous value.
//        f += 3; // output 8 cause f is 5 and adding by 3 become 8 it like f = f + 3;
//        f -= 2; // output 3 cause f is 5 and subtracting by 2 become 3 it like f = f - 2;
//        f *= 2; // output 10 cause f is 5 and multiplying by 2 become 10 it like f = f * 2;
//        f /= 2; // output 2.5 cause f is 5 and dividing by 2 become 2.5 it like f = f / 2;
//        f %= 3; // output 2 cause f is 5 which cannot directly divide by 3 so it will divide 3 and 2 become reminder;
        f &= 3;
//        f |= 2;
//        f ^= 3;
//        f >>= 3;
//        f <<= 3;

        System.out.println(f);


    }
}
