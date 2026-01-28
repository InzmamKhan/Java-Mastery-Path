package JAVA.Frameworks.Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

class My_CLass_ProgressBar{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progress Bar Example");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(10); // Set initial value
        progressBar.setStringPainted(true); // Show string on the bar

        JButton button = new JButton("Start");
        button.addActionListener(e -> {
            new Thread(() -> {
                int currentValue = progressBar.getValue();
                while(currentValue < 100) {
                    currentValue += 1;
                    progressBar.setValue(currentValue);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }).start();
        });

        frame.add(progressBar);
        frame.add(button);
        frame.setVisible(true);
    }
}