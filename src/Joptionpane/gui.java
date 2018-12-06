package Joptionpane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame implements ActionListener {

    private JTextField First_Num, Second_Num, First_Base, Second_Base, End_Base, end;
    private JLabel First_Num_Label, Second_Num_Label, First_Base_Label, Second_Base_Label, End_Base_Label;
    private JLabel text;
    private JButton Cal;

    public gui() {
        super("Calculator");

        setLayout(new GridBagLayout());
        GridBagConstraints layout = new GridBagConstraints();

        //do dis thing
        First_Num_Label = new JLabel("First num");
        Second_Num_Label = new JLabel("Second num");
        First_Base_Label = new JLabel("First Base");
        Second_Base_Label = new JLabel("Second Base");
        End_Base_Label = new JLabel("End Base");

        First_Num = new JTextField("First num",15);
        End_Base = new JTextField("Ending Base");
        text = new JLabel("+");
        Second_Num = new JTextField("Second num",15);
        First_Base = new JTextField("First Base");
        Second_Base = new JTextField("Second  base");
        end = new JTextField("answer",15);
        Cal = new JButton("Calculate");
        end.setEditable(false);


        layout.gridx = 0;
        layout.gridy = 1;
        add(First_Num_Label, layout);
        layout.gridx = 1;
        layout.gridy = 1;
        add(First_Num, layout);
        layout.gridx = 2;
        layout.gridy = 1;
        add(text, layout);
        layout.gridx = 3;
        layout.gridy = 1;
        add(Second_Num_Label, layout);
        layout.gridx = 4;
        layout.gridy = 1;
        add(Second_Num, layout);

        layout.gridx = 0;
        layout.gridy = 2;
        add(Second_Base_Label, layout);
        layout.gridx = 1;
        layout.gridy = 2;
        add(First_Base, layout);
        layout.gridx = 2;
        layout.gridy = 2;
        add(Second_Base_Label, layout);
        layout.gridx = 4;
        layout.gridy = 2;
        add(Second_Base, layout);


        layout.gridx = 1;
        layout.gridy = 3;
        add(End_Base,layout);
        layout.gridx = 1;
        layout.gridy = 4;
        add(Cal,layout);
        layout.gridx = 1;
        layout.gridy = 5;
        add(end,layout);

        Cal.addActionListener(this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Cal) {

            String convert1 = String.valueOf(Integer.parseInt(String.valueOf(First_Num.getText()), Integer.parseInt(First_Base.getText())));
            String convert2 = String.valueOf(Integer.parseInt(String.valueOf(Second_Num.getText()), Integer.parseInt(Second_Base.getText())));
            int x = Integer.parseInt(convert1) + Integer.parseInt(convert2);

            end.setText(Integer.toString(Integer.parseInt(String.valueOf(x)), Integer.parseInt(End_Base.getText())));
        }
    }
}


