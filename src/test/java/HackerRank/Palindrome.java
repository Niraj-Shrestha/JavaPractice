package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        if(isPalindrome(A)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        if(isPalindrome(101)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }

    public static Boolean isPalindrome(String A){
        int length = A.length();

        for (int i = 0; i < length / 2; i++) {
            if (A.charAt(i) != A.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert to String
        int n = s.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // We check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        // if no flaws are found we return true
        return true;
    }
}
