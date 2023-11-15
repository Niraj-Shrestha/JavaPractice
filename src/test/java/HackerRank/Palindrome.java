package HackerRank;

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
}
