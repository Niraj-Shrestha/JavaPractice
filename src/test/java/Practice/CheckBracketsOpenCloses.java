package Practice;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracketsOpenCloses {


    public static boolean isValid2(String s){
        char[] sChar = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char c : sChar){

            if(stack.isEmpty() && (c==']' || c=='}' || c==')'))
                return false;

            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');

            else if(c==')' && !stack.isEmpty()){
                char popped = stack.pop();
                if(popped != c)
                    return false;
            }
            else if(c=='}' && !stack.isEmpty()){
                char popped = stack.pop();
                if(popped != c)
                    return false;
            }
            else if(c==']' && !stack.isEmpty()){
                char popped = stack.pop();
                if(popped != c)
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValid(String s) {
        char[] list = s.toCharArray();
        for(int i=0;i<list.length;i++) {
            if (list[i] == '{') {
                for (int j = 0; j < list.length; j++) {
                    if (list[list.length - 1] == '}') {
                        return true;
                    }
                }
            }
            if (list[i] == '(') {
                for (int j = 0; j < list.length; j++) {
                    if (list[list.length - 1] == ')') {
                        return true;
                    }
                }
            }
            if (list[i] == '[') {
                for (int j = 0; j < list.length; j++) {
                    if (list[list.length - 1] == ']') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            isValid2(input);
            if (isValid2(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
    }
}
