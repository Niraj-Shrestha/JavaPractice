package HackerRank;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        String s = Integer.toString(n);
        if (s.equals(String.valueOf(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
