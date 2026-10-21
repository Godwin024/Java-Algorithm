package algorithms;

import java.util.Arrays;

public class ReversedArray {
    public static int[] reverseArray(int[] array) {
        int[]  arrays = {8,7,3,4,5};
        int start = 0;
        int end = arrays.length - 1;
        while (start < end) {
            int temp = arrays[start];
            arrays[start] = arrays[end];
            arrays[end] = temp;
            start++;
            end --;
        }
        return arrays;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(array)));
    }
}
