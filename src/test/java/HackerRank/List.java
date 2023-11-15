package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();
        sc.nextLine();

        while(q != 0) {
            String input = sc.nextLine();
            if (input.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
                sc.nextLine();
            }
            if (input.equals("Delete")) {
                list.remove(sc.nextInt());
                sc.nextLine();
            }
            q--;
        }

        for (int num : list){
            System.out.print(num + " ");
        }
    }
}
