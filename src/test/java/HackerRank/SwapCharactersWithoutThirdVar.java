package HackerRank;

public class SwapCharactersWithoutThirdVar {
    public static void main(String[] args) {
        char x = 'A';
        char y = 'B';
        System.out.println("originals: x="+x +" & y=" + y);
        x = (char) (x^y);
        y = (char) (x^y);
        x = (char) (x^y);
        System.out.println("New: x="+x +" & y=" + y);
    }
}
