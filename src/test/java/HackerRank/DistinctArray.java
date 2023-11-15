package HackerRank;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class DistinctArray {
    public static void main(String[] args) {
        // Sample array with duplicate elements
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        // Convert the array to a Set to automatically remove duplicates
        Set<Integer> distinctElements = new HashSet<>();

        // Add all elements from the array to the Set
        for (int num : arr) {
            distinctElements.add(num);
        }

        // Convert the Set back to an array (if needed)
        Integer[] distinctArray = distinctElements.toArray(new Integer[0]);

        // Print distinct elements
        for (int num : distinctArray) {
            System.out.println(num);
        }
    }
}
