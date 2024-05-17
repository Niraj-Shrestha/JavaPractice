package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MatchWord {

    public static void main(String[] args) {
        String x = "refragmentation";
        String y = "antiferromagnet";
        char[] xArr = x.toCharArray();
        char[] yArr = y.toCharArray();
        //checkUsingSort(xArr, yArr);
        checkUsingFrequency(xArr, yArr);
    }

    static void checkUsingSort(char[] xArr, char[] yArr) {
        if (xArr.length != yArr.length) {
            System.out.println("cannot be arranged");
        } else {
            Arrays.sort(xArr);
            Arrays.sort(yArr);
            if (Arrays.equals(xArr, yArr)) {
                System.out.println("Can be arranged");
            } else {
                System.out.println("Cannot be arranged");
            }
        }
    }

    static void checkUsingFrequency(char[] xArr, char[] yArr) {
        Map<Character, Integer> xArrSet = new HashMap<>();
        Map<Character, Integer> yArrSet = new HashMap<>();
        if (xArr.length != yArr.length) {
            System.out.println("cannot be arranged");
        } else {
            for (int i = 0; i < xArr.length; i++) {
                if (!xArrSet.containsKey(xArr[i])) {
                    xArrSet.put(xArr[i], 0);
                } else {
                    xArrSet.put(xArr[i], xArrSet.get(xArr[i]) + 1);
                }
            }
            for (int i = 0; i < yArr.length; i++) {
                if (!yArrSet.containsKey(yArr[i])) {
                    yArrSet.put(yArr[i], 0);
                } else {
                    yArrSet.put(yArr[i], yArrSet.get(yArr[i]) + 1);
                }
            }
        }
        System.out.println(xArrSet);
        System.out.println(yArrSet);
        if (xArrSet.equals(yArrSet)) {
            System.out.println("can be arranged");
        } else {
            System.out.println("cannot be arranged");
        }
    }
}
