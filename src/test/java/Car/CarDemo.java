package Car;

import javax.swing.*;

public class CarDemo {
    private JPanel Mainpanel;
    private JPanel NorthPanel;
    private JTextField textField1;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setContentPane(new CarDemo().Mainpanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
