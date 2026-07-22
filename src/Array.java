public class Array {
    public static void main (String[] args) {

        // normal Array
//        int[] numbers = {1,2,3,4,5,6,7};
//        System.out.println(numbers[6]);

        String[] languages = { "Java", "C++", "C#", "Python", "C", "Ruby", "JavaScript"};
        System.out.println(languages[0]);
        for (String language : languages) {
            System.out.println(language);
        }

        // Multidimensional Array
        int[][] numbers = {{1,2,3,4}, {6,7,8,9,5}};
        System.out.println(numbers[0][2]);
        for (int[] number : numbers) {
            for (int oneNumber : number) {
                System.out.println("God Sake: " + oneNumber);
            }
        }
    }
}
