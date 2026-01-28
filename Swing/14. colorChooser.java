package JAVA.Frameworks.Swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

class My_CLass_ColoChooser{
    public static void main(String args[]){
        JFrame frame = new JFrame("Color Chooser Example");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JButton button = new JButton("Choose Color");
        button.addActionListener( e-> {
            Color initialColor = Color.WHITE; // Default color
            Color selectedColor = JColorChooser.showDialog(frame, "Select a Color", initialColor);
            if (selectedColor != null) {
                System.out.println("Selected Color: " + selectedColor);
            }
            else {
                System.out.println("No color selected");
            }
        });
        frame.add(button);
        frame.setVisible(true);
    }
}