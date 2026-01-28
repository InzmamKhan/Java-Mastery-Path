package JAVA.GUI.Swing;

class My_Class_MouseListener{
    public static void main(String args[]){
        javax.swing.JFrame frame = new javax.swing.JFrame("Mouse Listener Example");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); 

        javax.swing.JLabel label = new javax.swing.JLabel("Click Me");
        label.setBounds(200, 200, 100, 100);
        label.setBackground(java.awt.Color.BLACK);
        label.setForeground(java.awt.Color.YELLOW);
        label.setOpaque(true);

        frame.add(label);

        // Add MouseListener to the label
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                System.out.println("Mouse Entered the label");
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                System.out.println("Mouse Exited the label");
            }
        });

        frame.setVisible(true);
    }
}