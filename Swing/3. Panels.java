package JAVA.Frameworks.Swing;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class My_Class_panel {
    public static void main(String[] args) {
        ImageIcon icon  = new ImageIcon("Your_Image.jpg");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);

        JLabel label =  new JLabel();
        label.setIcon(icon);
        label.setBounds(100, 100, 500, 500);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
        label.setBorder(border);





        JPanel panel = new JPanel();
        panel.setBounds(50, 50, 600, 600);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        panel.add(label);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));



       
        frame.add(panel);
        frame.setVisible(true);



    }
}
