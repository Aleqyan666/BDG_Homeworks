//package Arrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class MyArray {
//
//
//    /**
//     *
//     * @param n
//     * @return positive numbers of array
//     */
//
//    static int positiveElements(int[] n ){
//         n = new int[10];
//        for (int i = 0; i < n.length; i++){
//            if (n[i] > 0){
//                 System.out.println(n[i] + " , ");
//            }
//        }
//        return 0;
//    }
//
//
//
//
//    /**
//     *
//     * @param l
//     * @param
//     * @return largest element of array
//     */
//    static long largestElement(long[] l){
//        Arrays.sort(l);
//        return l[l.length - 1];
//    }
//
//    /**
//     *
//     * @param f
//     * @return smallest element of array
//     */
//    static float smallestElement(float[] f){
//        Arrays.sort(f);
//       return f[0];
//    }
//
//    static int matchCounter(int[] E){
//        int matches = 0;
//
//
//
//
//    /**
//     *
//     * @param first
//     * @param second
//     */
//    static void swapArrays(int[] first, int[] second){
//        int[] test = first;
//        first = second;
//        second = test;
//
//        System.out.println("The first = " + first + " | The second = " + second);
//
//    }
//
//    /**
//     *
//     * @param firstArray
//     * @param secondArray
//     * @return sums of the elements of arrays
//     */
//    static int[] sumOfArrays(int[] firstArray, int [] secondArray){
//        int[] overall = new int[10];
//        for (int i = 0; i <= firstArray.length; i++){
//            overall[i] = firstArray[i] + secondArray[i];
//
//
//        }
//            return overall;
//    }
//
//    public static void main(String[] args) {
//            long JJ[] = {2,58,6666,87,2};
//            System.out.println("The largest element is  - " + largestElement(JJ));
//
//
//
//    }
//
//}
