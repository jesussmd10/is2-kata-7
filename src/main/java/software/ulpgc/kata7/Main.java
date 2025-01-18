package software.ulpgc.kata7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());


        JLabel label = new JLabel("Hello, welcome to the app!", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.DARK_GRAY);


        JButton button = new JButton("Click here");
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        button.setBackground(Color.LIGHT_GRAY);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button pressed!");
                panel.setBackground(Color.CYAN);
            }
        });


        panel.add(label, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);


        frame.add(panel);


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}