package HackerRank;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming only lowercase letters

        for (int i = 0; i < a.length(); i++) {
            charCount[a.toLowerCase().charAt(i) - 'a']++; //will convert string to lower case and add the count in the array
            charCount[b.toLowerCase().charAt(i) - 'a']--; // will subtract the count in the array
        }

        //when tha addition and subtraction of the count is done it should be zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
