package PlayingWithObjects;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        System.out.println(objectService.getData());

        ObjectModel model = objectService.getData();
        System.out.println(model);
    }
}
