package HackerRank;

public class ReverseString {
    public static void main(String[] args) {
        String input = "niraj shrestha";
        char[] arr = input.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        System.out.println(arr);
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(arr);
    }
}
