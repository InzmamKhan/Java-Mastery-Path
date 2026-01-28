package JAVA.GUI.Swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class My_class_Button {

    void somework(){
        System.out.println("Button clicked");
    }
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        ImageIcon image =  new ImageIcon("Your_Image.jpg");

        JButton button =  new JButton();
        button.setText("Click Me");
        button.setBounds(100, 100, 100, 50);
        button.addActionListener(e -> {new My_class_Button().somework();} );
        button.setIcon(image);

        frame.add(button);
    }
}
