package HackerRank;

class Arithmetic{
    public int sum(int i, int j){
        return i+j;
    }
}

class Adder extends Arithmetic{

}

public class Hacker{
    public static void main(String []args){
        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        System.out.print(a.sum(10,13) + " " + a.sum(10,3) + " " + a.sum(10,10) + "\n");
    }
}