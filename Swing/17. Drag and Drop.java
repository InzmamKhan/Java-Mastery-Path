package JAVA.Frameworks.Swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class My_Class_DragAndDrop {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Drag and Drop Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        JLabel label = new JLabel("Drag Me");
        label.setBounds(200, 200, 100, 100);
        label.setBackground(java.awt.Color.BLACK);
        label.setForeground(java.awt.Color.YELLOW);
        label.setOpaque(true);

        frame.add(label);

        // Add MouseListener for drag and drop functionality
        label.addMouseListener(new MouseAdapter() {
            private int offsetX, offsetY;

            @Override
            public void mousePressed(MouseEvent e) {
                offsetX = e.getX();
                offsetY = e.getY();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen() - offsetX;
                int y = e.getYOnScreen() - offsetY;
                label.setLocation(x, y);
            }
        });

        frame.setVisible(true);
    }
}