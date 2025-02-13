import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Main {
    // Add functionality
    public static String currentInput = "";
    public static String operation = "";
    public static double result = 0;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 300);

        JTextField display = new JTextField();
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");

        JButton buttonAdd = new JButton("+");
        JButton buttonSub = new JButton("-");
        JButton buttonMul = new JButton("*");
        JButton buttonDiv = new JButton("/");
        JButton buttonEqual = new JButton("=");
        JButton buttonClear = new JButton("C");

        // Add functionality
        //Buttons
        button1.addActionListener(e -> {
            currentInput += "1";
            display.setText(currentInput);
        });
        button2.addActionListener(e -> {
            currentInput += "2";
            display.setText(currentInput);
        });
        button3.addActionListener(e -> {
            currentInput += "3";
            display.setText(currentInput);
        });
        button4.addActionListener(e -> {
            currentInput += "4";
            display.setText(currentInput);
        });
        button5.addActionListener(e -> {
            currentInput += "5";
            display.setText(currentInput);
        });
        button6.addActionListener(e -> {
            currentInput += "6";
            display.setText(currentInput);
        });
        button7.addActionListener(e -> {
            currentInput += "7";
            display.setText(currentInput);
        });
        button8.addActionListener(e -> {
            currentInput += "8";
            display.setText(currentInput);
        });
        button9.addActionListener(e -> {
            currentInput += "9";
            display.setText(currentInput);
        });
        button0.addActionListener(e -> {
            currentInput += "0";
            display.setText(currentInput);
        });

        // Operation
        buttonAdd.addActionListener(e -> {
            result = Double.parseDouble(currentInput);
            currentInput = "";
            operation = "+";
        });

        buttonEqual.addActionListener(e -> {
            if (Objects.equals(operation, "+")) {
                result += Double.parseDouble(currentInput);
            }

            display.setText(String.valueOf(result));
            currentInput = String.valueOf(result);
            operation = "";
        });

        buttonClear.addActionListener(e -> {
            display.setText("");
            currentInput = "";
            operation = "";
            result = 0;
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDiv);

        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMul);

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonSub);

        buttonPanel.add(button0);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonEqual);
        buttonPanel.add(buttonAdd);

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}