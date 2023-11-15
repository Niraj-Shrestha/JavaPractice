package HackerRank;

import java.util.Scanner;

public class StaticInitializationBlock {


    private static int B = 0;
    private static int L = 0;

    private static StaticInitializationBlock instance = new StaticInitializationBlock();

    private StaticInitializationBlock(){}

    public void checkSomething(){
        if (L > 0 && B > 0) {
            int area = L * B;
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        B = Integer.parseInt(scanner.nextLine());
        L = Integer.parseInt(scanner.nextLine());
        instance.checkSomething();
    }
}
