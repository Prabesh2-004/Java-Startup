package Array;

public class Arrays {
    public static void main(String[] args) {
        // Normal Array

//        int[] nums = new int[5];
//
//        for(int i=0;i<5;i++) {
//            nums[i] = (int) (Math.random() * 10) + 1;
//            System.out.print(nums[i] + " ");
//        }


        // Two Dimensional Array or Multi Dimensional Array

        //Direct Initialize array

//         int[][] mult = {{1,2,3,4},{4,5,6,7},{6,7,8,9}};

        // Same but a bit dynamically value passing

//        int[][] mult = new int[3][4];
//
//        for (int i=0;i<3;i++) {
//            for (int j=0;j<4;j++) {
//                mult[i][j] = (int) (Math.random() * 9) + 1;
//            }
//        }

        // for loop

//        for (int i=0;i<3;i++) {
//            for (int j=0;j<4;j++) {
//                System.out.print(mult[i][j] + " ");
//            }
//            System.out.println();
//        }

        // for each loop

//        for (int[] i : mult) {
//            for (int j: i) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        // star printing in incremental order
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
                if(i == 5) {
                    for (int z=4;z>=j;z--) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }

        // star printing in decremental order
        for(int i=5; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
