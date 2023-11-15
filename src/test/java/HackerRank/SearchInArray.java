package HackerRank;

public class SearchInArray {
    public static void main(String[] args) {
        String[] arr = {"niraj","apple","mango","cat", "dog"};
        String searchKeyword = "mango";
        for(int i= 0; i< arr.length;i++){
            if(searchKeyword == arr[i]){
                System.out.println("Item matched at: " + i);
            }
        }
    }
}
