package src;

import javax.swing.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /*
        JFrame frame = new JFrame();
        frame.setTitle("Garble");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(600,600);
        frame.setVisible(true);

        //sets the icon of the frame
        ImageIcon image = new ImageIcon("image.png");
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(new Color(30,30,30));

        //test

         */

        ImageIcon image = new ImageIcon("image.png");

        JLabel label = new JLabel();
        label.setText("Garble Game");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00F0));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.add(label);

    }
}
