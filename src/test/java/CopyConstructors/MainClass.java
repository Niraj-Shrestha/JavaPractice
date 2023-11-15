package CopyConstructors;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MainClass {
    public static void main(String[] args) {
        Area circle = new Circle(1.0);
        Area rectangle = new Rectangle((Circle) circle, 1);
        circle.calculateArea();
        circle.printArea();

        rectangle.calculateArea();
        rectangle.printArea();
        Boolean as = false;

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(circle, rectangle, "Assertion 1 failed");
    }
}
