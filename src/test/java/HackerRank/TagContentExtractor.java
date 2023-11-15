package HackerRank;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String regex = "<([^<>]+)>([^<>]+)<\\/(\\1)>";
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            boolean check=false;
            String line = in.nextLine();
            Pattern pattern= Pattern.compile(regex);
            Matcher matcher= pattern.matcher(line);
            while(matcher.find())
            {
                System.out.println(matcher.group(2));
                check = true;
            }
            if(check==false)
            {
                System.out.println("None");
            }
            testCases--;
        }
    }
}
