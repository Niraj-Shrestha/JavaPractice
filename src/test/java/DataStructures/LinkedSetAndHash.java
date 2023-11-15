package DataStructures;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedSetAndHash {

    public static void main(String[] args) {
        linkedHashSet();
        linkedHashMap();
    }


    public static void linkedHashSet(){
        LinkedHashSet<String> something= new LinkedHashSet<>();
        something.add("test");
        something.add("test2");
        System.out.println(something);
    }

    public  static void linkedHashMap(){
        LinkedHashMap<Integer, String> something = new LinkedHashMap<>();
        something.put(101, "one");
        something.put(102, "two");
        System.out.println(something);
        System.out.println(something.get(101));
    }
}
