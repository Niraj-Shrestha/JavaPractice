import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortingTest {

    public static void main(String[] args){
        int[] array = {1,4,5,9,6,5,4,7,8};

        int n = array.length;
        System.out.println(array.length);
        for(int i = 0; i< n-1;i++){
            for(int j = 0; j < n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int x=0; x< array.length;x++){
            list.add(array[x]);
        }
        System.out.println(list);
    }
}
