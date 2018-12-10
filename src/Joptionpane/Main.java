package Joptionpane;

import javax.swing.*;
import java.awt.*;

public class Main {
        public static void main(String[] args){

            gui Frame = new gui();
            Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Frame.setLocationRelativeTo(null);
            //Frame.setSize(600,200);
            Frame.pack();


            Frame.setVisible(true);
        }
    }


