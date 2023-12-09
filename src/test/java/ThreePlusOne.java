
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class ThreePlusOne {
    public static void main(String[] args) {
        int i = 7;

        List<Integer> items = new ArrayList<>();

        while(true){
            if(checkEven(i) == true){
                i = i/2;
                System.out.println("Even: " + i);
                items.add(i);
            }else {
                i = 3*i + 1;
                System.out.println("Odd: " + i);
                items.add(i);
            }

            if(i == 1){
                break;
            }
        }

        SwingUtilities.invokeLater(() -> new ThreePlusOneChart("Dynamic Chart Example", items));
        ThreePlusOneChart threePlusOneChart = new ThreePlusOneChart("test",items);
        threePlusOneChart.input(items);
    }

    static boolean checkEven(int i){
        if(i%2 == 0){
            return true;
        }
        return false;
    }
}
