package Abstraction;

public class Interface {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        circle.draw();    // Output: Drawing a circle
        rectangle.draw(); // Output: Drawing a rectangle

        circle.dom();
    }
}

// Interface representing a Drawable object
interface Drawable {
    void draw();

    default void dom(){
        System.out.println("something");
    }
}

// Class representing a Circle that implements the Drawable interface
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Class representing a Rectangle that implements the Drawable interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
