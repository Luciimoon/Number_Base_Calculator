package Joptionpane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame implements ActionListener {

    private JTextField First_Num, Second_Num, First_Base, Second_Base, end;
    private JLabel text;
    private JButton Cal;

    public gui() {
        super("gui");

        setLayout(new GridBagLayout());
        GridBagConstraints layout = new GridBagConstraints();


        First_Num = new JTextField("First num");

        text = new JLabel("+");

        Second_Num = new JTextField("Second num");

        First_Base = new JTextField("First Base");
        Second_Base = new JTextField("Second  base");
        end = new JTextField("answer",15);
        Cal = new JButton("Calculate");
        end.setEditable(false);


        layout.gridx = 1;
        layout.gridy = 1;
        add(First_Num, layout);
        layout.gridx = 2;
        layout.gridy = 1;
        add(text, layout);
        layout.gridx = 3;
        layout.gridy = 1;
        add(Second_Num, layout);
        layout.gridx = 1;
        layout.gridy = 2;
        add(First_Base, layout);
        layout.gridx = 3;
        layout.gridy = 2;
        add(Second_Base, layout);
        layout.gridx = 1;
        layout.gridy = 3;
        add(Cal,layout);
        layout.gridx = 1;
        layout.gridy = 4;
        add(end,layout);

        Cal.addActionListener(this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Cal) {
            

        }
    }
}


