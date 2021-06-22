package Car;

import javax.swing.*;
import java.awt.*;

public class CarWin {
    static final int WIDTH = 1200;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH,600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button1 = new JButton("Option");
        JButton button2 = new JButton("leave");
        JButton button3 = new JButton("Hello");
        JButton button4 = new JButton("Menu");
        JButton button5 = new JButton("Main");
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);
        frame.setVisible(true);


    }
}
