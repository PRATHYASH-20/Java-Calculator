import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

    boolean operatorClicked = false;
    double newValue, oldValue;
    int calculation = 0;

    JFrame frame;
    JLabel displayLabel;

    JButton sevenButton, eightButton, nineButton, clearButton;
    JButton fourButton, fiveButton, sixButton;
    JButton oneButton, twoButton, threeButton;
    JButton zeroButton, dotButton, equalButton;
    JButton divisionButton, multiplyButton, subtractButton, plusButton;

    Calculator() {

        frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setSize(900, 900);
        frame.setLocation(400, 90);
        frame.setVisible(true);

        displayLabel = new JLabel();
        displayLabel.setFont(new Font("Arial", Font.BOLD, 50));
        displayLabel.setBounds(40, 10, 800, 200);
        displayLabel.setBackground(Color.LIGHT_GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setForeground(Color.BLACK);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(displayLabel);

        // Row 1
        sevenButton = createButton("7", 40, 250);
        eightButton = createButton("8", 200, 250);
        nineButton = createButton("9", 360, 250);

        // Row 2
        fourButton = createButton("4", 40, 400);
        fiveButton = createButton("5", 200, 400);
        sixButton = createButton("6", 360, 400);

        // Row 3
        oneButton = createButton("1", 40, 550);
        twoButton = createButton("2", 200, 550);
        threeButton = createButton("3", 360, 550);

        // Row 4
        dotButton = createButton(".", 40, 700);
        zeroButton = createButton("0", 200, 700);
        equalButton = createButton("=", 360, 700);

        // Operators
        divisionButton = createOperator("/", 520, 250);
        multiplyButton = createOperator("*", 520, 400);
        subtractButton = createOperator("-", 520, 550);
        plusButton = createOperator("+", 520, 700);

        // Clear button
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(650, 400, 200, 250);
        clearButton.setFont(new Font("Arial", Font.BOLD, 30));
        clearButton.setForeground(Color.CYAN);
        clearButton.addActionListener(this);
        frame.add(clearButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method to create number buttons
    private JButton createButton(String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 100, 100);
        button.setFont(new Font("Arial", Font.BOLD, 30));
        button.addActionListener(this);
        frame.add(button);
        return button;
    }

    // Method to create operator buttons
    private JButton createOperator(String text, int x, int y) {
        JButton button = createButton(text, x, y);
        button.setForeground(Color.RED);
        return button;
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Numbers
        if (e.getSource() == sevenButton) appendNumber("7");
        else if (e.getSource() == eightButton) appendNumber("8");
        else if (e.getSource() == nineButton) appendNumber("9");
        else if (e.getSource() == fourButton) appendNumber("4");
        else if (e.getSource() == fiveButton) appendNumber("5");
        else if (e.getSource() == sixButton) appendNumber("6");
        else if (e.getSource() == oneButton) appendNumber("1");
        else if (e.getSource() == twoButton) appendNumber("2");
        else if (e.getSource() == threeButton) appendNumber("3");
        else if (e.getSource() == zeroButton) appendNumber("0");

        else if (e.getSource() == dotButton) {
            displayLabel.setText(displayLabel.getText() + ".");
        }

        // Operators
        else if (e.getSource() == plusButton) {
            operatorClicked = true;
            oldValue = Double.parseDouble(displayLabel.getText());
            calculation = 1;
        }

        else if (e.getSource() == subtractButton) {
            operatorClicked = true;
            oldValue = Double.parseDouble(displayLabel.getText());
            calculation = 2;
        }

        else if (e.getSource() == multiplyButton) {
            operatorClicked = true;
            oldValue = Double.parseDouble(displayLabel.getText());
            calculation = 3;
        }

        else if (e.getSource() == divisionButton) {
            operatorClicked = true;
            oldValue = Double.parseDouble(displayLabel.getText());
            calculation = 4;
        }

        else if (e.getSource() == clearButton) {
            displayLabel.setText("");
        }

        else if (e.getSource() == equalButton) {

            switch (calculation) {

                case 1:
                    newValue = oldValue + Double.parseDouble(displayLabel.getText());
                    break;

                case 2:
                    newValue = oldValue - Double.parseDouble(displayLabel.getText());
                    break;

                case 3:
                    newValue = oldValue * Double.parseDouble(displayLabel.getText());
                    break;

                case 4:
                    newValue = oldValue / Double.parseDouble(displayLabel.getText());
                    break;
            }

            String result = Double.toString(newValue);

            if (result.endsWith(".0")) {
                result = result.replace(".0", "");
            }

            displayLabel.setText(result);
        }
    }

    private void appendNumber(String number) {
        if (operatorClicked) {
            displayLabel.setText(number);
            operatorClicked = false;
        } else {
            displayLabel.setText(displayLabel.getText() + number);
        }
    }
}