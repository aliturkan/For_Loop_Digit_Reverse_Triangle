public class ForLoopDigitReverseTriangle {
    public static void main(String[] args) {
        for(int i =1; i<=9; i++) {

            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int m = i; m <= 9; m++) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

//        1 2 3 4 5 6 7 8 9
//         2 3 4 5 6 7 8 9
//          3 4 5 6 7 8 9
//           4 5 6 7 8 9
//            5 6 7 8 9
//             6 7 8 9
//              7 8 9
//               8 9
//                9