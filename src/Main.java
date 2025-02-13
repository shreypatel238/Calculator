import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new GridLayout(4, 4));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 300);

        // Add components

        // Add functionality 

        frame.setVisible(true);
    }
}