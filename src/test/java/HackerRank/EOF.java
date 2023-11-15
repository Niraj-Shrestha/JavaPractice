package HackerRank;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        //hasNextLine to check each line together  and hasNext if you want to check each word
        while (scanner.hasNextLine()){
            String text = scanner.nextLine();
            System.out.println(count + " " + text);
            count ++;
        }
        scanner.close();
    }
}
