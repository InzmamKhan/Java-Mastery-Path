package JAVA.Frameworks.Swing;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class My_CLass_TextField{
    public static void main(String args[]){
        JFrame frame = new JFrame("TextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        JPanel panel = new JPanel();
        panel.setBounds(50, 50, 100, 100);
        panel.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK, 10));

        // Creating a Text Field
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        textField.setText("Enter text here");
        textField.setToolTipText("This is a text field");
        textField.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK, 2));
        panel.add(textField);

        // Creating a Button
        JButton button = new JButton("Add");
        button.setBounds(50, 100, 100, 30);
        panel.add(button);
        button.addActionListener(e -> {
            String enteredText = textField.getText();
            System.out.println("Entered Data: " + enteredText);
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}