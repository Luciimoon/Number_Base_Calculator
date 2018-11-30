package Joptionpane;

import javax.swing.*;
import java.awt.*;

public class gui extends JFrame {

    private JTextField field1;
    private JLabel text;
    private JTextField field2;
    private JTextField field3;
    private JTextField field4;


    public gui() {
        super("gui");

        setLayout(new GridBagLayout());

        field1 = new JTextField("First num");

        text = new JLabel("+");

        field2 = new JTextField("Second num");

        field3 = new JTextField("First Base");
        field4 = new JTextField("Second  base");


        field1.setBounds(50,0,0,0);


        add(field1);
        add(text);
        add(field2);
        add(field3);
        add(field4);



    }


    }


