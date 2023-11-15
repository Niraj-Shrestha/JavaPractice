package CopyConstructors;

public class Rectangle extends Area{

    double length;
    double breadth;
    Rectangle(Circle radius, double breadth){
        this.length = radius.radius;
        this.breadth = breadth;
    }
    @Override
    public void calculateArea() {
        area = length * breadth;
    }
}
