import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {

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
    }
}
