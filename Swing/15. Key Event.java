package JAVA.Frameworks.Swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class My_Class_KeyEvent{
    public static void main(String args[]){
        JFrame frame = new JFrame("Slider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); 

        JLabel label = new JLabel("Move Me");
        label.setBounds(200, 200, 100, 100);
        label.setBackground(java.awt.Color.BLACK);
        label.setForeground(java.awt.Color.YELLOW);
        label.setOpaque(true);

        frame.add(label);

        // Add KeyListener to the frame
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int x = label.getX();
                int y = label.getY();
                switch(e.getKeyChar()){
                    case 'a':
                        label.setLocation(x - 10, y);
                        break;
                    case 'd':
                        label.setLocation(x + 10, y);
                        break;
                    case 'w':
                        label.setLocation(x, y - 10);
                        break;
                    case 's':
                        label.setLocation(x, y + 10);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + e.getKeyChar());
            }

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }
        });

        frame.setFocusable(true);
        frame.setVisible(true);
        frame.requestFocusInWindow(); // Request focus so key events are captured
    }
}