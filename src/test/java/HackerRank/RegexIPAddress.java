package HackerRank;

import java.util.Scanner;

public class RegexIPAddress {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }

}
class myRegex {
    static String pattern = "^(0\\d\\d?|\\d\\d?|1\\d\\d|2[0-4]\\d|25[0-5])\\.(0\\d\\d?|\\d\\d?|1\\d\\d|2[0-4]\\d|25[0-5])\\.(0\\d\\d?|\\d\\d?|1\\d\\d|2[0-4]\\d|25[0-5])\\.(0\\d\\d?|\\d\\d?|1\\d\\d|2[0-4]\\d|25[0-5])$";
}