package Static_NonStaticClassMembers;

public class StaticClassMembers {
    public static int x;
    public static int y;

    static {
        x = 1;
        y = 2;
    }

    public static void main(String args[]) {
        System.out.println("From Static Variable Class: " + StaticVariable.i);
        StaticMethod.method();
        System.out.println("From Static Block: " + (x + y));
    }
}

class StaticVariable {
    static int i = 1;
}

class StaticMethod {
    static void method() {
        System.out.println("From Static Method");
    }
}
