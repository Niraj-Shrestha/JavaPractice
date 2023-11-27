package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighestInArray {
    public static void main(String[] args) {
        int[] arr = {1,9,6,4,6,7,4,10,22};
        usingListSort(arr);
        usingIndex(arr);
    }

    static void usingListSort(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i< arr.length; i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        int highestIndex = list.size();
        System.out.println(list.get(highestIndex-2));
    }

    static void usingIndex(int[] arr){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i] > highest){
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] < highest) {
                secondHighest = arr[i];
            }
        }

        System.out.println(secondHighest);
    }
}
