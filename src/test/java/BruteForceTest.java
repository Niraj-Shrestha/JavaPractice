public class BruteForceTest {
    public static void main(String[] args) {
        int targetPin = 1234;
        long startTime = 0,endTime = 0;

        startTime = System.currentTimeMillis();
        for (int guess = 0; guess <= 10000; guess++) {
            if (guess==targetPin) {
                System.out.println("Brute force successful. PIN found: " + guess);
                break;
            }
        }
        endTime = System.currentTimeMillis();


        long TimeTaken = endTime - startTime;
        System.out.println("Start Time: "+ startTime + " ms");
        System.out.println("End Time: " + endTime + " ms");
        System.out.println("Difference: " + TimeTaken + " ms");

    }
}