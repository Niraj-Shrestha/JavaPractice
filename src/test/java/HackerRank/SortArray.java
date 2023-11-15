package HackerRank;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {4,6,9,3,2,1,4,53,5,7,9,0,4,3,2,3,2};
        boolean swapped;

        System.out.println(arr);
        do {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println(Arrays.toString(arr));
    }
}
