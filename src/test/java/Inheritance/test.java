package Inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class test {

    public static void main(String[] args) {
        int[] arr = {10,10,10,10,20,20,20,30,30};

        test();

        /*List<Integer> list = new ArrayList();

        for(int num: arr){
            list.add(num);
        }
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            int x = list.get(i);
            int counter = 1;

            for(int j = 0; j < i ; j++){
                int y = list.get(j);
                if(x == y){
                    counter ++;
                }
            }
            if(counter > 1){
                System.out.println("'" + x + "' appears " + counter + " times.");
            }
        }


        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,);
        }

        for(int num : map.keySet()){
            if(map.get(num) > 1){
                System.out.println("'" + num + "' appears " + map.get(num) + " times.");;
            }
        }*/
    }

    static void  test(){
        int[] arr = {10,10,10,10,20,20,20,30,30};
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i<arr.length;i++){
                int val = arr[i];
                if(map.get(val)==null){
                    map.put(val, 1);
                }else{
                    map.put(val,map.get(val)+1);
                }

            }

        map.forEach((key, value) -> {
            System.out.println(key +" appeared "+value + " Times");
        });
    }
}
