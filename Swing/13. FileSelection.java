package JAVA.Frameworks.Swing;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class My_CLass_File{
    public static void main(String args[]){
        JFrame frame = new JFrame("File Selection Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        JFileChooser fileChooser = new JFileChooser();

        JButton button = new JButton("Select File");
        button.addActionListener( e -> {
            int returnValue = fileChooser.showOpenDialog(frame);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(frame, "Selected file: " + selectedFile);
            } 
            else {
                JOptionPane.showMessageDialog(frame, "No file selected");
            }
        });
        

        frame.add(button);
        button.setBounds(150, 70, 100, 30);
        frame.setVisible(true);
    }
}