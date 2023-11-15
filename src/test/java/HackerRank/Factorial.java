package HackerRank;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long result = factorial(n);
        System.out.println(result);
    }

    static long factorial(long n){
        if(n!=0){
            return (n*factorial(n-1));
        }else {
            return 1;
        }
    }
}
