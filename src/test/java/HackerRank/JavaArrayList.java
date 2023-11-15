package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int d = input.nextInt();
            ArrayList<Integer> innerList = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                int number = input.nextInt();
                innerList.add(number);
            }

            list.add(innerList);
        }

        int queries = input.nextInt();

        for (int k = 0; k < queries; k++) {
            int indexArr = input.nextInt()-1;
            int innerIndex = input.nextInt()-1;

            if (indexArr < list.size() && innerIndex < list.get(indexArr).size()) {
                int q = list.get(indexArr).get(innerIndex);
                System.out.println(q);
            } else {
                System.out.println("ERROR!");
            }
        }
    }

}
