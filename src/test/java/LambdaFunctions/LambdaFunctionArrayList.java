package LambdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaFunctionArrayList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Kiss my ass");

        simplePrint(stringList);

        usingStream(stringList);

    }

    static void simplePrint(List<String> stringList){
        stringList.forEach( value -> System.out.println(value));
    }


    /**
     *
     * @param stringList
     * Using System.out::println and param -> System.out.println(param) gives same result
     * stream is used mostly for filtering the values
     */

    static void usingStream(List<String> stringList){
        stringList.stream().filter(name -> name.startsWith("K")).forEach(val -> System.out.println(val));
    }

}
