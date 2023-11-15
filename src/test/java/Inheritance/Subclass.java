package Inheritance;

public class Subclass extends BaseClass{

    public Subclass(String param){
        super(param);
    }

    @Override
    void doSomething(){
        System.out.println("Subclass");
        super.doSomething();
    }
}

class BaseClass{
    String val;
    public BaseClass(String param){this.val = param; }
    void doSomething(){
        System.out.println("BaseClass");
        System.out.println("Print the value of i: " + val);
    }
}