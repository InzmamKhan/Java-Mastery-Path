package JAVA.GUI.Swing;

import javax.swing.JOptionPane;

class My_Class_JOptionPane{
    public static void main(String[] args) {
        // Show a message dialog
        JOptionPane.showMessageDialog(null, "Hello, this is a message dialog!", "Message", JOptionPane.INFORMATION_MESSAGE);
        
        // Show a confirm dialog
        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            System.out.println("User chose Yes");
        } else {
            System.out.println("User chose No");
        }
        
        // Show an input dialog
        String name = JOptionPane.showInputDialog(null, "Enter your name:", "Input", JOptionPane.QUESTION_MESSAGE);
        System.out.println("User entered: " + name);

        // Show an option dialog
        Object[] options = {"Option 1", "Option 2", "Option 3"};
        int option = JOptionPane.showOptionDialog(null, "Choose an option:", "Options",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println("User selected: " + options[option]);

        // Show a custom dialog with an icon
        JOptionPane.showMessageDialog(null, "This is a custom dialog with an icon!", "Custom Dialog",   JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon("JAVA\\Source\\Sample_Phoenix_Icon.jpg"));

    }
}