package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ListVsArrayList {
    public static void main(String[] args) {
    ListVsArrayList obj = new ListVsArrayList();
    obj.array();
    obj.arrayList();
    }

    public void array(){
        int[] i = new int[2];
        i[0] = 1;
        i[1] = 2;
        int i0 = i[0];
        int i1 = i[1];
        System.out.println(i0 + i1);
    }

    public void arrayList(){
        List<Integer> array = new ArrayList();
        array.add(10);
        array.add(11);
        int a1 = array.get(0);
        int a2 = array.get(1);
        System.out.println(a1 + a2);
    }
}
