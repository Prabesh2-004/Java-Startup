public class Strings {
    public static void main(String[] args) {
        String name = "Rujal";
        String gay = "Rujal";

        String greet = "Greeting";
        String anotherGreet = "Greeting My Lord";

        String untrimWord = "  Hello World!  ";

        System.out.println(name.length()); // check length of string
        System.out.println(name.toUpperCase()); // make word all capital letter
        System.out.println(name.toLowerCase()); // make word all small letter
        System.out.println(anotherGreet.indexOf("My")); // find index of a letter
        System.out.println(greet.charAt(0)); // find the letter at index 0
        System.out.println(greet.charAt(7)); // find the letter at index 7
        System.out.println(name.equals(gay)); // compare one variable value is equal to another variable
        System.out.println(greet.equals(anotherGreet)); // compare one variable value is equal to another variable
        System.out.println("untrim word [" + untrimWord + "]"); // printing value with unnecessary space
        System.out.println("after trim [" + untrimWord.trim() + "]"); // removing unnecessary space


        // String Concatenation

        String text1 = "Hello ";
        String text2 = "World";
        String text3 = "!";
        System.out.println(text1 + text2 + text3);
        System.out.println(text1.concat(text2.concat(text3)));

    }
}
