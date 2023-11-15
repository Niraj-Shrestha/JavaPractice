package LeetCode;

import java.util.*;

public class LeetCodeQ1 {
    public static void main(String[] args) {
        String s ="codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }

    static String restoreString(String s, int[] indices) {
        ArrayList list = new ArrayList();
        for(int val : indices){
            list.add(val);
        }
        HashMap<Integer, Character> Map = new HashMap<>();
        for(int i =0; i < indices.length;i++){
            Map.put((Integer) list.get(i),s.toLowerCase().charAt(i));
        }

        StringBuilder str = new StringBuilder();
        char val;
        for(int i = 0; i< Map.size(); i++){
            val = Map.get(i);
            str.append(val);
        }
        return str.toString();
    }
}
