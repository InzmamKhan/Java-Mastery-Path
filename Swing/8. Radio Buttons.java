package JAVA.Frameworks.Swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class MY_class_RadioButtons{
    public static void main(String args[]){
        JFrame frame = new JFrame("TextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new java.awt.FlowLayout());

        JRadioButton button1 = new JRadioButton();
        button1.setText("Option 1");
        button1.addActionListener(e -> {
            if (button1.isSelected()) {
                System.out.println("Option 1 selected");
            }});
        JRadioButton button2 = new JRadioButton();
        button2.setText("Option 2");
        button2.addActionListener(e -> {
            if (button2.isSelected()) {
                System.out.println("Option 2 selected");
            }});
        JRadioButton button3 = new JRadioButton();
        button3.setText("Option 3");
        button3.addActionListener(e -> {
            if (button3.isSelected()) {
                System.out.println("Option 3 selected");
            }});

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
    }
    }