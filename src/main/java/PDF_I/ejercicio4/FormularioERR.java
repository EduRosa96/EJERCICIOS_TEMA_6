package PDF_I.ejercicio4;

import javax.swing.*;
import java.awt.event.*;

public class FormularioERR extends JFrame implements ActionListener {

    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;

    public FormularioERR() {
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10, 10, 100, 30);
        add(textField1);
        textField2 = new JTextField();
        textField2.setBounds(10, 50, 100, 30);
        add(textField2);
        button1 = new JButton("Sumar");
        button1.setBounds(10, 90, 100, 30);
        add(button1);
        button1.addActionListener(this);
        button2 = new JButton("Restar");
        button2.setBounds(10,120, 100,30);
        add(button2);
        button2.addActionListener(this);
    }

    // extraemos el contenido de los controles con getText()
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String cad1 = textField1.getText();
            String cad2 = textField2.getText();
            // sumamos los valores inresados debemos convertir el contenido en integer
            int x1 = Integer.parseInt(cad1);
            int x2 = Integer.parseInt(cad2);

            int suma = x1 + x2;

            String total = String.valueOf(suma);
            setTitle(total);

        } else if(e.getSource() == button2){
            String cad1 = textField1.getText();
            String cad2 = textField2.getText();

            int x1 = Integer.parseInt(cad1);
            int x2 = Integer.parseInt(cad2);

            int resta = x1 - x2;

            String total = String.valueOf(resta);
            setTitle(total);
        }
    }

    public static void main(String[] args) {
        FormularioERR formularioERR =new FormularioERR();
        formularioERR.setBounds(0,0,300,350);
        formularioERR.setVisible(true);
    }
}

