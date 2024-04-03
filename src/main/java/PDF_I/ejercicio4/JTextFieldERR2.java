package PDF_I.ejercicio4;

import javax.swing.*;
import java.awt.event.*;

import static java.awt.AWTEventMulticaster.add;

public class JTextFieldERR2 {
    private JTextField textField1;
    private JPanel panel1;
    private JTextField textField2;
    private JButton button1;

    public JTextFieldERR2() {
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10, 10, 100, 30);
        add(textField1);
        textField2 = new JTextField();
        textField2.setBounds(10, 50, 100, 30);
        add(textField2);
        button1 = new JButton("Sumar");
        s(10, 90, 100, 30);
        add(button1);
        button1.addActionListener(this);

    }
// hasta aqui he llegao jose :(

}

