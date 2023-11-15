package DataStructures;

import java.util.Random;

public class RandomNumber {

    public static  void main(String[] args){
        System.out.println(generateRandomInt());
        System.out.println(generateRandomLong());
    }
    public static int generateRandomInt(){
        int min = 0;
        int max = 100;
        Random rand = new Random();
        int randomNum = rand.nextInt(max - min) + min;
        return randomNum;
    }

    public static long generateRandomLong(){
        long min = 1111111l;
        long max = 99999999l;
        Random rand = new Random();
        long randomNum = (long) rand.nextDouble(min,max);
        return randomNum;
    }

    public static String generateRandomString(){
        String input = "";
        Random rand = new Random();
        return rand.toString();
    }
    public static String randGeneratedStr() {
        int l= 10;
        String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
        StringBuilder s = new StringBuilder(l);
        int i;
        for (i = 0; i < l; i++) {
            int ch = (int) (AlphaNumericStr.length() * Math.random());
            s.append(AlphaNumericStr.charAt(ch));
        }
        return s.toString();
    }
}
