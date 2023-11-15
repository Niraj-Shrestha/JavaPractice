package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataType {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(T);
        for(int i = 0; i < T; i++) {
            String n = bufferedReader.readLine();
            try{
                Byte.parseByte(n);
                System.out.println(n + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }catch (NumberFormatException e){
                try{
                    Short.parseShort(n);
                    System.out.println(n + " can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }catch (NumberFormatException e1){
                    try{
                        Integer.parseInt(n);
                        System.out.println(n + " can be fitted in:");
                        System.out.println("* int");
                        System.out.println("* long");
                    }catch (NumberFormatException e2){
                        try {
                            Long.parseLong(n);
                            System.out.println(n + " can be fitted in:");
                            System.out.println("* long");
                        }catch (NumberFormatException e3){
                            System.out.println(n + " can't be fitted anywhere.");
                        }
                    }
                }
            }
        }
    }
}
