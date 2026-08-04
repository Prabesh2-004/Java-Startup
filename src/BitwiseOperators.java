public class BitwiseOperators {
    public static void main(String[] args) {
        int a = -5;
        int b = 4;

//        int c = a & b;
//        int c = a | b;
//        int c = a ^ b;
//        int c = a << 1;
//        int c = a >> 1;
        int c = a >> 1;
        System.out.println(Integer.toBinaryString(a)); // 101
        System.out.println(Integer.toBinaryString(b)); // 100
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));

        // AND: & --> AND operator is like multipy if one value contain 0 it will become 0 by taking example from above value if we do "a & b" it will become 4 or say 100 cause when we multipy 4 and 5 in binary like 101/100 lets calculate clearly 1 and 1 become 1; 0 and 0 become 0; 1 and 0 become 0; answer become 100 which is 4;

        // OR: | -->  OR operator is like adding if one value contain 1 it will become 1 by taking example from above value if we do "a | b" it will become 5 or say 101 cause when we add 4 and 5 in binary like 101/100 lets calculate clearly 1 and 1 become 1; 0 and 0 become 0; 1 and 0 become 1; answer become 101 which is 5;

        // XOR: ^ --> XOR operator work like if both value are same like 1 and 1 or 0 and 0 it will become 0; if 2 value are different for each other like one is 1 and another one is 0 and vice versa it will become 1; lets take it above example 101/100 lets calculate clearly 1 and 1 become 0; 0 and 0 become 0; 1 and 0 become 1; answer is 001 which is 1;

        // NOT: ~ --> NOT operator work like negative to positive and vice versa what I am saying is it will convert 0 to 1 and 1 to 0; lets take it above example a which is 5 and its binary is 101 when we perform NOT in a/5/101 it will become 010 as you can see it convert 1 to 0 and 0 to 1; all invisible 29 0 bits also convert into 1 which was previously a 0.

        // LEFT SHIFT: << --> LEFT SHIFT operator shift the binary value to the left like by taking above example 101/5/a if we assign " a << 1 " it will become 1010/10. let makes it clear |1|0|1| we have value like this when we shift to left it will become like this |1|0|1| | we shift every value by one but after shifting there is blank space remain which we fill by 0; how to work we assign shift to a variable a by 1 " a << 1 " we can replace 1 by any number by how much want to shift.

        // RIGHT SHIFT: >> --> RIGHT SHIFT is also same as left but it shit to right like in above example 101/5/a if we apply right shift by 1 " a >> 1 " it will become 10 only; last 1 from 101 was removed from its position abd it become only 10 which is 2;

        // UNSIGNED RIGHT SHIFT: >>> --> UNSIGNED RIGHT SHIFT is also like RIGHT SHIFT but a bit different in RIGHT SHIFT all previous value will be replaced depend upon sign like it is positive all previous value will be 0 if negative it will become 1; lets make it clear 101/5/a all previous value of 101 which 29 0 which is hidden during compilation but in the case of minus it will replace by all shifted a bit as well '11'111111111111111111111111111101/-3 if we replaced win UNSIGNED RIGHT SHIFT it will replace it with 0,'00'1111111111111111111111111111101/2147483645 and answer will different.
    }
}
