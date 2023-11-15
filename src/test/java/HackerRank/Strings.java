package HackerRank;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);
        int result = A.compareTo(B);
        if(result > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String firstString = A.substring(0, 1).toUpperCase();
        A = firstString + A.substring(1);
        String secondString = B.substring(0, 1).toUpperCase();
        B = secondString + B.substring(1);
        System.out.println(A + " " +B);
    }
}
