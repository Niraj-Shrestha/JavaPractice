package Practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1,-2};
        addElement(arr);
        duplicateElement(arr);
    }

    static void addElement(int[] elements){
        Set<Integer> list = new HashSet<>();
        for(int i = 0 ; i < elements.length; i++) {
            list.add(elements[i]);
        }
        System.out.println(list);
    }
    static void duplicateElement(int[] elements){
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int element : elements) {
            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }
        System.out.println(duplicateElements);
    }
}
