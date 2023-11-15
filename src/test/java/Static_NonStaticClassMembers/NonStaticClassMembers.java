package Static_NonStaticClassMembers;

public class NonStaticClassMembers {
    public static void main(String args[]) {
        Variable variable = new Variable();
        System.out.println("Non Static variable: " + variable.i);
        Method method = new Method();
        method.method();
    }
}

class Variable {
    int i = 1;
}

class Method {
    void method() {
        System.out.println("Method from subclass");
    }
}
