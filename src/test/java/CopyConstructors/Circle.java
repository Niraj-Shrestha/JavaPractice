package CopyConstructors;

public class Circle  extends  Area{
    Double PI  = 3.14;
    Double radius;
    public Circle(Double radius) {
        this.radius = radius;
    }
    @Override
    void calculateArea() {
        area = PI * radius * radius;
    }
}
