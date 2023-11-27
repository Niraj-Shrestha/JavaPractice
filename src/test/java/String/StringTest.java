package String;

import java.io.IOException;
import java.util.GregorianCalendar;

public class StringTest {
    public static void main(String[] args) throws IOException {
        String str = "This is sample string";
        //stringBuilder(str);
        //stringBuffer(str);
        stringPerf();
    }

    static void stringBuilder(String str){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str).append("test");
        stringBuilder.insert(4," insert");
        System.out.println(stringBuilder);
    }

    static void stringBuffer(String str){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str).append("Test");
        stringBuilder.insert(4," insert");
        System.out.println(stringBuilder);
    }

    static void stringPerf(){
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        //StringBuffer sb = new StringBuffer();
        //Time Taken:226
        //Memory used:11359080
        StringBuilder sb = new StringBuilder();
        //Time Taken:167
        //Memory used:-5467824
        for(int i = 0; i<10000000; i++){
            sb.append(":").append(i);
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(startMemory-endMemory));
    }
}
