package HackerRank;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] arr = {50,10,7,200,201,56,1100,8888,222};
        checkMax(arr);
        checkMin(arr);
    }

    public static void checkMax(int[] arr){
        if(arr == null || arr.length <0){
            throw new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        for(int i= 0 ; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max is: " + max);
    }
    public static void checkMin(int[] arr){
        if(arr == null || arr.length <0){
            throw new IllegalArgumentException("Array is empty");
        }
        int min = arr[0];
        for(int i= 0 ; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min is: " + min);
    }
}
