package LeetCode;

import java.util.HashSet;

public class LeetCodeQ3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        /*char[] chars = s.toCharArray();
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c: chars){
            set.add(c);
        }
        count = set.size();
        System.out.println(count);*/

        int start = 0;
        int end = 0;
        int maxLength = 0;
        HashSet<Character> uniqueCharacters = new HashSet<>();
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, uniqueCharacters.size());
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        System.out.println(maxLength);
    }
}
