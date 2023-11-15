package HackerRank;

import java.util.Scanner;

public class DataType2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int integerVal = Integer.parseInt(scanner.nextLine());
        double doubleVal = Double.parseDouble(scanner.nextLine());
        String stringVal = scanner.nextLine();
        System.out.println("String: " + stringVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Int: " + integerVal);
    }
}
