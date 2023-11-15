package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queryNum = scanner.nextInt();
        System.out.println(queryNum);
        for(int i=0;i<queryNum;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int k = a+((int)Math.pow(2,0))*b;
            for(int j=1; j<n+1; j++){
                System.out.print(k + " ");
                k = k + (int)Math.pow(2,j)*b;
            }
            System.out.println();
        }
        scanner.close();

    }
}
