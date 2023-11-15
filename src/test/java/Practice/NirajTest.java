package Practice;

import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

import java.util.*;

public class NirajTest {
    public static void main(String[] args) {
        /*int[] arr = {1,2,3,4,5,4,3,2,1,-2};

        List<Integer> list = new ArrayList();
        for(int i = 0 ; i < arr.length ; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        System.out.println(list);*/
        //swapListBubbleSort(list);
        //selectionSort(list);
        //insertionSort(list);
        //System.out.println(factorial(10));
        //System.out.println(factorialRecursion(10));
        /*if(pallindrome("nirajarin")){
            System.out.println("pallindrome");
        }else {
            System.out.println("no pallindrome");
        }*/
        //fibonacci(100);

        /*int n = 10;
        for(int i = 0 ; i <= n ; i++){
            System.out.println(fibonacci(i));
        }*/

        //anagrams("A Gentleman","Elegant Man");

        String str = "niraj niraj shrestha";
        String[] words = str.split("\\s");
        HashMap<String,Integer> list = new HashMap<>();
        int i = 0;
        for(String word : words){
            list.put(word,i);
            i++;
        }
        System.out.println(list);

        //checkDuplicateIntegerUsingStack(list);
        checkDuplicateStringUsingStack(List.of(words));
        //checkDuplicateStringUsingQueue(List.of(words));
    }

    static void swapListBubbleSort(List<Integer> list){
        int n = list.size();
        Boolean swap;
        for(int i = 0 ; i < n - 1; i++) {
            swap = false;
            for(int j = 0; j <n - i- 1 ;j ++){
                if(list.get(j) > list.get(j +1 )){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        System.out.println("Bubble sorted list: "+ list);
    }

    static void selectionSort(List<Integer> list){
        int n = list.size();
        for(int i =0; i< n -1 ; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(index) > list.get(j)) {
                    index = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }
        System.out.println("Selection Sorted List: " + list);
    }

    static void insertionSort(List<Integer> list){
        int n = list.size();
        for(int i = 1 ; i< n ;i++){
            int key = list.get(i);
            int j = i - 1;
            while(j>=0 && list.get(key) > key){
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1,key);
        }

        System.out.println("Insertion Sort: " + list);
    }

    static int factorial(int n){
        int result = 1;
        for(int i = 1; i<=n; i++ ){
            result = i*result;
        }
        return  result;
    }

    static int factorialRecursion(int n){
        if(n == 0){
            return 1;
        }else {
            return factorialRecursion(n-1)*n;
        }
    }

    static boolean pallindrome(String word){
        int length = word.length();
        for(int i = 0; i<length/2; i++){
            if(word.charAt(i) != word.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

    static int fibonacci(int n){
        if(n<=1){
            return n;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    static void anagrams(String word1, String word2){
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            System.out.println("Yes Anagrams");;
        }else {
            System.out.println("Not Anagrams");
        }
    }

    static void checkDuplicateIntegerUsingStack(List<Integer> list){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< list.size();i++){
            int index = stack.search(list.get(i));
            if(index == -1){
                stack.add(list.get(i));
            }
        }
        System.out.println(stack);
    }

    static void checkDuplicateStringUsingStack(List<String> list){
        Stack<String> stack = new Stack<>();
        for(int i=0; i< list.size();i++){
            int index = stack.search(list.get(i));
            if(index == -1){
                stack.add(list.get(i));
            }
        }
        System.out.println(stack);
    }

    static void checkDuplicateStringUsingQueue(List<String> list){
        Queue<String> queue = new LinkedList<>();
        for(int i=0; i< list.size();i++){
            boolean index = queue.contains(list.get(i));
            if(!index){
                queue.add(list.get(i));
            }
        }
        System.out.println(queue + " "+ queue.size());
    }
}
