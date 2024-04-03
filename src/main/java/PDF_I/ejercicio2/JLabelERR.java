package PDF_I.ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;

public class JLabelERR extends JFrame{
    private JPanel panel1;
    private JLabel label1, label2;

    public JLabelERR(){

        setLayout(null);
        label1 =new JLabel("Eduardo Rodríguez Rosa");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2 =new JLabel("1º DAW - C.E.I.P.Tartessos");
        label2.setBounds(10,100,300,30);
       add(label2);
    }

    public static void main(String[] args) {
        JLabelERR formulario1 =new JLabelERR();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(true);
        formulario1.setVisible(true);
    }
}
