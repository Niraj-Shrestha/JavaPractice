package HackerRank;

import java.util.Scanner;

public class SplitStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens = s.split("[\\s , ' . ? @ _ !]+");

        int tokenCount = 0;

        for (String token : tokens) {
            if (!token.isEmpty()) {
                tokenCount++;
            }
        }

        System.out.println(tokenCount);

        // Print each token on a new line
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
