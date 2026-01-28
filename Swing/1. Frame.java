package JAVA.GUI.Swing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

class My_class_frame{
    public static void main(String args[]){
        JFrame frame = new JFrame("My First Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation

        frame.setSize(400, 300);
        frame.setResizable(false); // Make the frame non-resizable
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        frame.getContentPane().setBackground(Color.CYAN);
        frame.getContentPane().setBackground(new Color(0, 0, 0) ); 
        frame.setVisible(true); 

        ImageIcon icon  = new ImageIcon("JAVA\\Source\\Sample_Phoenix_Icon.jpg");
        frame.setIconImage(icon.getImage()); 

    }
}