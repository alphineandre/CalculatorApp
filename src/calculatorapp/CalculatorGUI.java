package calculatorapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField display;
    private String currentInput = "";
    private Calculator calculator;

    public CalculatorGUI() {
        calculator = new Calculator();

        // Set up frame
        setTitle("Calculator App");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        // Button labels
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789".contains(command)) {
            currentInput += command;
            display.setText(currentInput);
        } else if (command.equals("C")) {
            currentInput = "";
            display.setText("");
        } else if (command.equals("=")) {
            try {
                double result = evaluateExpression(currentInput);
                display.setText(String.valueOf(result));
                currentInput = String.valueOf(result);
            } catch (Exception ex) {
                display.setText("Error");
                currentInput = "";
            }
        } else {
            currentInput += " " + command + " ";
            display.setText(currentInput);
        }
    }

    private double evaluateExpression(String expression) {
        String[] tokens = expression.split(" ");
        double num1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double num2 = Double.parseDouble(tokens[2]);

        switch (operator) {
            case "+": return calculator.add(num1, num2);
            case "-": return calculator.subtract(num1, num2);
            case "*": return calculator.multiply(num1, num2);
            case "/": return calculator.divide(num1, num2);
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
