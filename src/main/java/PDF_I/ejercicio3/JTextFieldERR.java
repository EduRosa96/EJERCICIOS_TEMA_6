package PDF_I.ejercicio3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldERR extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JLabel label1;

    public JTextFieldERR() {
        setLayout(null);
        label1 = new JLabel("Usuario");
        label1.setBounds(10, 10, 100,30);
        add(label1);
        textField1 = new JTextField();
        textField1.setBounds(120, 80, 100, 30);
        add(textField1);
        button1 = new JButton("Sumar");
        button1.setBounds(10, 80, 100, 30);
        add(button1);
        button1.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String cad = textField1.getText();
            setTitle(cad);
        }
    }

    public static void main(String[] args) {
        JTextFieldERR FormularioERR = new JTextFieldERR();
        FormularioERR.setBounds(0, 0, 300, 150);
        FormularioERR.setVisible(true);
    }
}
