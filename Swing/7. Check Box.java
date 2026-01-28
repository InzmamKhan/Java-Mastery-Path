package JAVA.GUI.Swing;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

class My_Class_CheckBox{
    public static void main(String[] args) {

        JFrame frame = new JFrame("TextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);

        JCheckBox checkbox = new JCheckBox();
        checkbox.setBounds(50, 50, 200, 30);
        checkbox.setText("Check me");
        checkbox.setToolTipText("This is a checkbox");
        checkbox.addActionListener(e -> {
            if (checkbox.isSelected()) {
                System.out.println("Checkbox is selected");
            } else {
                System.out.println("Checkbox is not selected");
            }
        });

        frame.add(checkbox);
        frame.setVisible(true);
    }
}