package JAVA.Frameworks.Swing;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class My_Class_Label {
    public static void main(String[] args) {
        ImageIcon icon  = new ImageIcon("JAVA\\Source\\Sample_Phoenix_Icon.jpg");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);



        JLabel label =  new JLabel();
        label.setBounds(100, 100, 500, 500);

        label.setIcon(icon);

        label.setText("Hello, World!"); 
        label.setForeground(Color.BLACK);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
        label.setBorder(border);

        frame.add(label);
        frame.setVisible(true);
    }
}
