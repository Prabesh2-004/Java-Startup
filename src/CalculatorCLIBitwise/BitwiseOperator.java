package CalculatorCLIBitwise;

import java.util.Scanner;

/*
1. Addition (+) --> Solved with XOR (^) and AND (&)
    -> Addition consists of two parts: adding bits and carrying over.
    -> XOR (^) acts as "addition without carry". For example, 1 + 1 = 0$ and 1 + 0 = 1$.
    -> AND (&) followed by Left Shift (<< 1) calculates the "carry". For example, $1 \text{ AND } 1 = 1$, which needs to be shifted left by 1 position to be added to the next higher bit.
    -> The Process: You repeatedly compute sum = a ^ b and carry = (a & b) << 1, replacing a with sum and b with carry in a loop until there is no carry left (carry == 0).

2. Subtraction (-) ---> Solved with Addition and Two's Complement
    -> Subtracting $b$ from $a$ ($a - b$) is mathematically identical to adding the negative of $b$ ($a + (-b)$).
    -> To negate a binary number using bitwise operators, you use Two's Complement: invert all bits (~b) and add 1 using your bitwise addition logic.
    -> The Process: Compute neg_b = Add(~b, 1), and then compute Add(a, neg_b).

3. Multiplication (*) ---> Solved with Shift (<<) and Addition
    -> Multiplication is just repeated binary addition based on powers of 2 (similar to long multiplication you learned in school).
    -> If you multiply a by b, look at each bit of $b$ from right to left:
    -> If the i-th bit of b is 1, it means you need to add a * 2^i to the total result.
    -> In binary, multiplying a by 2^i is achieved simply by left-shifting: a << i.
    -> The Process: Iterate through the bits of b. If the current bit is 1, add a << i to your running sum (using your bitwise addition method). Shift a left and b right on each step.
4. Division (/) ---> Solved with Shift (>> / <<) and Subtraction
    -> Division determines how many times the divisor can "fit" into the dividend.
    -> Instead of subtracting the divisor one by one (which is very slow), you find the largest power of 2 (2^k) such that (divisor << k) <= dividend.
    -> The Process:
    -> Align the divisor with the top bits of the dividend by shifting it left.
    -> If the shifted divisor is smaller than or equal to the remaining dividend, subtract it using your bitwise subtraction method, and set the corresponding bit in your quotient.
    -> Repeat by shifting the divisor right until you've processed all bit positions down to 0.
*/

public class BitwiseOperator {
    static Scanner scanner = new Scanner(System.in);

    static int Add(int a, int b) {
        int sum;
        int carry;
        while (b != 0) {
            sum = a ^ b;
            carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }

    static int Sub(int a, int b) {
        int neg_b = Add(~b, 1);
        return Add(a, neg_b);
    }

    static int Mul(int a, int b) {
        int result = 0;

        int x = Math.abs(a);
        int y = Math.abs(b);

        while (y > 0) {
            if ((y & 1) != 0) {
                result = Add(result, x);
            }

            x <<= 1;
            y >>>= 1;
        }

        boolean isNegative = (a < 0) ^ (b < 0);
        if (isNegative) {
            result = Add(~result, 1);
        }

        return result;
    }

    static int Div(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((b << i) <= a) {
                a = Sub((int) a, (int) (b << i));
                quotient |= (1L << i);
            }
        }

        int result = (int) quotient;

        if (isNegative) {
            result = Add(~result, 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int a;
        int b;
        char c;
        System.out.print("Enter your first number: ");
        a = scanner.nextInt();
        System.out.print("Enter an operator: ");
        c = scanner.next().charAt(0);
        System.out.print("Enter your second number: ");
        b = scanner.nextInt();
        scanner.close();

        switch(c) {
            case '+' -> System.out.println(Add(a,b));
            case '-' -> System.out.println(Sub(a,b));
            case '*' -> System.out.println(Mul(a,b));
            case '/' -> System.out.println(Div(a,b));
        }
    }
}
