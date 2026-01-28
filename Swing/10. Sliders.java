package JAVA.GUI.Swing;

import javax.swing.JFrame;
import javax.swing.JSlider;

class My_class_Sliders {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Slider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new java.awt.FlowLayout());

        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setOrientation(1); // 1 for vertical orientation, 0 for horizontal
        slider.addChangeListener(e -> {
            int value = slider.getValue();
            System.out.println("Slider value: " + value);
        });

        frame.add(slider);
        frame.setVisible(true);
    }
}