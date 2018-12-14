package JoptionPane_gui;

import javax.swing.*;

public class convert {

    public void convert(String First_Num, String First_Base, String Second_Num, String Second_Base, String End_Base) {


        String convert1 = String.valueOf(Integer.parseInt(String.valueOf(First_Num), Integer.parseInt(First_Base)));
        String convert2 = String.valueOf(Integer.parseInt(String.valueOf(Second_Num), Integer.parseInt(Second_Base)));
        int x = Integer.parseInt(convert1) + Integer.parseInt(convert2);

        String end = Integer.toString(Integer.parseInt(String.valueOf(x)), Integer.parseInt(End_Base));

        JOptionPane.showMessageDialog(null,end);

    }


}
