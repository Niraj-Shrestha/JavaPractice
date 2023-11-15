package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*try{   //there was issue without try catch why?
            int testCases = in.nextInt();
            while(testCases>0){
                String pattern = in.next();
                try{
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                }catch (PatternSyntaxException e){
                    System.out.println("Invalid");
                }
            }
        }catch (Exception e){}*/

        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            try {
                String pattern = in.nextLine();
                Pattern.compile(pattern);
                System.out.println("Valid");

            } catch (PatternSyntaxException e1) {
                System.out.println("Invalid");
            }

            testCases--;
        }
    }
}
