package Constructors;

public class ParameterizedConstructor {
    public static void main(String args[]){
        ConstructorClass constructorClass = new ConstructorClass("Passing parameter to constructor");
        constructorClass.doSomething();
    }
}


class ConstructorClass{
    String param;
    public ConstructorClass(String param){
        this.param = param;
    }
    void doSomething(){
        System.out.println(param);
    }
}
