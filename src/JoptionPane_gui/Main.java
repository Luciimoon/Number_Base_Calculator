package JoptionPane_gui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        convert cal = new convert();

        String first_num = JOptionPane.showInputDialog("first number?");

        String first_base = JOptionPane.showInputDialog("first base?");

        String second_num = JOptionPane.showInputDialog("second number?");

        String second_base = JOptionPane.showInputDialog("second base?");

        String end_num = JOptionPane.showInputDialog("ending base?");

        cal.convert(first_num,first_base,second_num,second_base, end_num);


    }



}
