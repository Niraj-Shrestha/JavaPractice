import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Interface for defining a callback function
interface ButtonClickListener {
    void onClick();
}

// Custom button class that accepts a callback
class CallbackButton extends JButton {
    private ButtonClickListener clickListener;

    public CallbackButton(String label) {
        super(label);
    }

    // Setter for the click listener callback
    public void setClickListener(ButtonClickListener listener) {
        this.clickListener = listener;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (clickListener != null) {
                    clickListener.onClick();
                }
            }
        });
    }
}

public class CallbackExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Callback Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        CallbackButton button1 = new CallbackButton("Click Me");
        CallbackButton button2 = new CallbackButton("Or Click Me");

        // Define callback implementations
        button1.setClickListener(new ButtonClickListener() {
            @Override
            public void onClick() {
                JOptionPane.showMessageDialog(null, "Button 1 clicked!");
            }
        });

        button2.setClickListener(new ButtonClickListener() {
            @Override
            public void onClick() {
                JOptionPane.showMessageDialog(null, "Button 2 clicked!");
            }
        });

        frame.add(button1);
        frame.add(button2);
        frame.setVisible(true);
    }
}
