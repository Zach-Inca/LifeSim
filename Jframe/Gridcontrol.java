package Jframe;

import javax.swing.*;

public class Gridcontrol {

    public static void main(String[] args) {

       JFrame frame = new JFrame("Hello World");
        frame.setSize(960,960);
   
        GridLayoutOG panel = new GridLayoutOG();
        frame.add(panel);

        frame.setVisible(true);
        //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
