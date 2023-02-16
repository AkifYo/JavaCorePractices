package P04_Course;

import javax.swing.*;
import java.util.ArrayList;

public class A03_DetectArrowKeys {
    public A03_DetectArrowKeys(){
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setFocusable(true);

        JPanel panel= new JPanel();
        JLabel up=new JLabel();
        JLabel down=new JLabel();
        JLabel left=new JLabel();
        JLabel right=new JLabel();
        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);

        frame.add(panel);

        up.setText("Up:0");
        down.setText("Up:0");
        left.setText("Up:0");
        right.setText("Up:0");


    }
    public static void main(String[] args) {
    new A03_DetectArrowKeys();
        ArrayList a= new ArrayList<>();
    }
}
