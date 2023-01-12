package src;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("Garble");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(600,600);
        this.setVisible(true);

        //sets the icon of the frame
        ImageIcon image = new ImageIcon("image.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(30,30,30));
    }
}
