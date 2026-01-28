package JAVA.Frameworks.Swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class My_CLass_MenuBar{
    public static void main(String args[]){
        JFrame frame = new JFrame("Slider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new java.awt.FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Menu 1");
        JMenuItem item11 = new JMenuItem("Item 1.1");
        item11.addActionListener(e -> System.out.println("Item 1.1 clicked"));
        JMenuItem item12 = new JMenuItem("Item 1.2");
        item12.addActionListener(e -> System.out.println("Item 1.2 clicked"));
        menu1.add(item11);
        menu1.add(item12);
        menuBar.add(menu1);

        
        JMenu menu2 = new JMenu("Menu 2");
        JMenuItem item21 = new JMenuItem("Item 2.1");
        item21.addActionListener(e -> System.out.println("Item 2.1 clicked"));
        JMenuItem item22 = new JMenuItem("Item 2.2");
        item22.addActionListener(e -> System.out.println("Item 2.2 clicked"));
        menu2.add(item21);
        menu2.add(item22);
        menuBar.add(menu2);

        
        JMenu menu3 = new JMenu("Menu 3");
        JMenuItem item31 = new JMenuItem("Item 3.1");
        item31.addActionListener(e -> System.out.println("Item 3.1 clicked"));
        JMenuItem item32 = new JMenuItem("Item 3.2");
        item32.addActionListener(e -> System.out.println("Item 3.2 clicked"));
        menu3.add(item31);
        menu3.add(item32);
        menuBar.add(menu3);


        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}