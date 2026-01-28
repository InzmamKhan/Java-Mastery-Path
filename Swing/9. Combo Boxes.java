package JAVA.Frameworks.Swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class My_class_COmboBox{
    public static void main(String args[]){
        JFrame frame = new JFrame("TextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new java.awt.FlowLayout());

        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");
        comboBox.addItem("Option 3");
        comboBox.addActionListener(e -> {
            String selectedItem = (String) comboBox.getSelectedItem();
            System.out.println("Selected item: " + selectedItem);
        });
        frame.add(comboBox);
        frame.setVisible(true);


    }
}